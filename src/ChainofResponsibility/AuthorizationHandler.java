package ChainofResponsibility;

public class AuthorizationHandler extends Handler {
    @Override
    public boolean handle(Request request) {
        if (!request.userType.equalsIgnoreCase("admin") && !request.userType.equalsIgnoreCase("employee")) {
            System.out.println("Authorization Failed; requested user type is not admin or employee");
        }
        System.out.println("Authorization Successful");
        return next != null && next.handle(request);
    }
}
