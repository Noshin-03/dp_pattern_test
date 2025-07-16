package Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        CheckoutFacade facade = new CheckoutFacade();
        facade.checkout("Book", 19.99);
    }
}
