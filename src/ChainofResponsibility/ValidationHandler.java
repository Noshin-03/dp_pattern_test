package ChainofResponsibility;

public class ValidationHandler extends Handler {
    @Override
    public boolean handle(Request request) {
        if (request.requestId == null || request.requestId.length() < 3) {
            System.out.println("Validation failed: Invalid requestId.");
            return false;
        }

        if ("add_product".equalsIgnoreCase(request.requestType)) {
            if (request.body == null || !request.body.contains(",")) {
                System.out.println("Validation failed: Body must contain product name and price.");
                return false;
            }
        }

        System.out.println("Validation passed.");
        return next != null && next.handle(request);
    }
}

