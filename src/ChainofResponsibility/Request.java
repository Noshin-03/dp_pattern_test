package ChainofResponsibility;

public class Request {
    String userId;
    String userType;
    String requestId;
    String requestType;
    String body;

    public Request(String userId, String userType, String requestId, String requestType, String body) {
        this.userId = userId;
        this.userType = userType;
        this.requestId = requestId;
        this.requestType = requestType;
        this.body = body;
    }
}


