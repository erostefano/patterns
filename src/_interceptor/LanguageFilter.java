package _interceptor;

public class LanguageFilter implements Filter {
    @Override
    public void filter(Http http) {
        http.getHeaders().replace("Accept-Language", "en-US");
    }
}
