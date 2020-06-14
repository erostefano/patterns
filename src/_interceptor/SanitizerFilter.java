package _interceptor;

public class SanitizerFilter implements Filter {
    @Override
    public void filter(Http http) {
        String body = http.getBody();
        String sanitizedBody = body.replace("swearword", "nice");
        http.setBody(sanitizedBody);
    }
}
