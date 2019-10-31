package _adapter;

public class AdapterExample {
    public static void main(String[] args) {
        BoilerAdapter boilerAdapter = new BoilerAdapter();
        String result = boilerAdapter.cook();
        System.out.println(result);
    }
}
