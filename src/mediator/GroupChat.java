package mediator;

import java.util.HashMap;
import java.util.Map;

public class GroupChat implements GroupChatMediator {
    private Map<String, ChatGroup> groups = new HashMap<>();

    @Override
    public void createGroup(String groupId) {
        if (!groups.containsKey(groupId)) {
            groups.put(groupId, new ChatGroup(groupId));
            System.out.println("Group '" + groupId + "' created.");
        }
    }

    @Override
    public void addUserToGroup(User user, String groupId) {
        ChatGroup group = groups.get(groupId);
        if (group != null) {
            group.addUser(user);
            user.joinGroup(groupId);
            System.out.println(user.getName() + " has been added to group '" + groupId + "'");
        } else {
            System.out.println("Group '" + groupId + "' not found.");
        }
    }

    @Override
    public void sendMessage(User sender, String groupId, String message) {
        ChatGroup group = groups.get(groupId);
        if (group != null && group.getUsers().contains(sender)) {
            for (User user : group.getUsers()) {
                if (!user.equals(sender)) {
                    user.receiveGroupMessage(groupId, sender, message);
                }
            }
        } else {
            System.out.println("Group not found or sender not in group.");
        }
    }
}
