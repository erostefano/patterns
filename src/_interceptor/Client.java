package _interceptor;

public class Client {
    FilterChain filterChain;

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public void sendRequest() {
        this.filterChain.execute();
    }
}
