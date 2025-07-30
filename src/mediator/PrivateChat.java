package mediator;

public class PrivateChat implements PrivateChatMediator {
    @Override
    public void sendMessage(User sender, User receiver, String message) {
        receiver.receivePrivateMessage(sender, message);
    }
}
