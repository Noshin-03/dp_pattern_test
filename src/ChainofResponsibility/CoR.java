package ChainofResponsibility;
import java.util.HashSet;
import java.util.Set;

public class CoR {
    public static void main(String[] args) {
        Set<String> cacheSet = new HashSet<>();
        cacheSet.add("R-1");

        Handler chain = new CacheHandler(cacheSet);
        Handler authHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler validationHandler = new ValidationHandler();
        Handler orderingHandler = new OrderHandler();

        chain.setNext(authHandler)
                .setNext(authorizationHandler)
                .setNext(validationHandler)
                .setNext(orderingHandler);

        Request request1 = new Request("admin1","admin", "R-1", "add_product", "Laptop,42k");
        Request request2 = new Request("employee1","employee", "R-3", "get_product", "");

        System.out.println("Request 1: ");
        boolean result1 = chain.handle(request1);
        System.out.println("Result 1: " + (result1 ? "Success" : "Failure"));

        System.out.println("Request 2: ");
        boolean result2 = chain.handle(request2);
        System.out.println("Result 2: " + (result2 ? "Success" : "Failure"));
    }
}
