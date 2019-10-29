package _singleton;

public class PrinterManagerService {

    private static PrinterManagerService printerManagerService;
    private static PrinterManagerService printerManagerServiceSafe = new PrinterManagerService();

    /**
     * Private and empty constructor
     */
    private PrinterManagerService() {
    }

    /*
      Thread safe as only one instance exists since start
     */
    public static PrinterManagerService getInstance() {
        return printerManagerServiceSafe;
    }

    /*
      Lazy loading is not thread safe. Multiple threads could create multiple instances of this.
     */
    public static PrinterManagerService getInstanceLazy() {
        if (printerManagerService == null) {
            printerManagerService = new PrinterManagerService();
        }
        return printerManagerService;
    }

    public void print() {
        System.out.println("Printing document ...");
    }
}
