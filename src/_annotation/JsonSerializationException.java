package _annotation;

class JsonSerializationException extends Throwable {
    JsonSerializationException(String message) {
        System.err.println(message);
    }
}
