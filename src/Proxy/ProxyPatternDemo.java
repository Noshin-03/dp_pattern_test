package Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Database adminDb = new DatabaseProxy("admin");
        Database guestDb = new DatabaseProxy("guest");

        adminDb.query("SELECT * FROM users");
        guestDb.query("SELECT * FROM users");
    }
}
