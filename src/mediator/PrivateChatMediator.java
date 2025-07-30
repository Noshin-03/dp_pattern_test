package mediator;

public interface PrivateChatMediator {
    void sendMessage(User sender, User receiver, String message);
}
