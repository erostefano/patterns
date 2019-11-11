package _proxy;

public class DatabaseService implements IDatabase {
    @Override
    public String getData() {
        return "high protected internal data";
    }
}
