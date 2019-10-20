package _annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Check https://www.baeldung.com/java-custom-annotation
 */
public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        Person person = new Person("John", "Doe", "2010-03-03", "USA", "Earth");
        checkIfJsonSerializable(person);
        initializeObject(person);
        System.out.println(getJsonString(person));
    }

    private static void checkIfJsonSerializable(Object object) throws JsonSerializationException {
        if (Objects.isNull(object)) {
            throw new JsonSerializationException("The object to serialize is null");
        }

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new JsonSerializationException("The class "
                    + clazz.getSimpleName()
                    + " is not annotated with JsonSerializable");
        }
    }

    private static void initializeObject(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Init.class)) {
                method.setAccessible(true);
                /*
                 * The method init() gets invoked. This means givenName and familyName go to uppercase!
                 */
                method.invoke(object);
            }
        }
    }

    private static String getJsonString(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        Map<String, String> jsonElementsMap = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                jsonElementsMap.put(getKey(field), (String) field.get(object));
            }
        }

        String jsonString = jsonElementsMap.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\""
                        + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + jsonString + "}";
    }

    private static String getKey(Field field) {
        return field.getAnnotation(JsonElement.class).key().length() > 0
                ? field.getAnnotation(JsonElement.class).key()
                : field.getName();
    }
}
