package _proxy;

public class ProxyExample {

    public static void main(String[] args) {
        AccessProxy accessProxy = new AccessProxy(Channel.INTERNAL);

        try {
            String data = accessProxy.getData();
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
