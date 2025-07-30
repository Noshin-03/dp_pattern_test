package ChainofResponsibility;

public class AuthenticationHandler extends Handler {
    @Override
    public boolean handle(Request request) {
        if (request.userId == null || request.userId.isEmpty()) {
            System.out.println("Authentication Failed; userId is empty");
        }
        System.out.println("Authentication Successful");
        return next != null && next.handle(request);
    }
}
