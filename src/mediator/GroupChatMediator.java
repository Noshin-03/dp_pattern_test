package mediator;

public interface GroupChatMediator {
    void sendMessage(User sender, String groupId, String message);
    void createGroup(String groupId);
    void addUserToGroup(User user, String groupId);
}
