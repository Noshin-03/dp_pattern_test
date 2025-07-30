package ChainofResponsibility;

public class OrderHandler extends Handler {
    @Override
    public boolean handle(Request request) {
        if("add_product".equalsIgnoreCase(request.requestType)) {
            String[] parts = request.body.split(",");
            if (parts.length == 3) {
                System.out.println("Invalid product body format");
                return false;
            }
            String name = parts[0].trim();
            String price = parts[1].trim();
            System.out.println("Adding product " + name + " " + price);
        } else if ("get_product".equalsIgnoreCase(request.requestType)) {
            System.out.println("Getting product " + request.requestType);

        } else {
            System.out.println("Invalid request type");
            return false;
        }
        return true;
    }
}
