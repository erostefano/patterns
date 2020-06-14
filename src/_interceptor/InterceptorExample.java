package _interceptor;

import java.util.HashMap;
import java.util.Map;

public class InterceptorExample {
    public static void main(String[] args) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept-Language", "fr-FR");

        Http http = new Http();
        http.setHeaders(headers);
        http.setBody("swearword");

        FilterChain filterChain = new FilterChain(http);
        filterChain.addFilter(new LanguageFilter());
        filterChain.addFilter(new SanitizerFilter());

        Client client = new Client();
        client.setFilterChain(filterChain);
        client.sendRequest();
    }
}
