package _proxy;

public class AccessProxy implements IDatabase {

    private Channel channel;
    private DatabaseService databaseService = new DatabaseService();

    AccessProxy(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String getData() throws Exception {
        if (channel != Channel.INTERNAL) {
            throw new Exception(channel + " is not allowed to access the data!");
        }
        return databaseService.getData();
    }
}
