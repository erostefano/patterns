package _generic_dao;

import java.lang.reflect.Field;

public class ImplDao<T> implements IGenericDao<T> {
    @Override
    public T save(T entity) {
        Field fieldName = entity.getClass().getDeclaredFields()[0];
        String className = entity.getClass().getSimpleName();
        System.out.println("Saved " + className + " " + getValueFromField(fieldName, entity) + "!");
        return entity;
    }

    private String getValueFromField(Field field, Object entity) {
        try {
            field.setAccessible(true);
            return field.get(entity).toString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return "null";
        }
    }
}
