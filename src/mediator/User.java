package mediator;

import java.util.*;

public class User {
    private String name;
    private PrivateChatMediator privateMediator;
    private GroupChatMediator groupMediator;
    private Set<String> joinedGroups = new HashSet<>();

    public User(String name, PrivateChatMediator privateMediator, GroupChatMediator groupMediator) {
        this.name = name;
        this.privateMediator = privateMediator;
        this.groupMediator = groupMediator;
    }

    public String getName() {
        return name;
    }

    public void joinGroup(String groupId) {
        joinedGroups.add(groupId);
    }

    public boolean isInGroup(String groupId) {
        return joinedGroups.contains(groupId);
    }

    public void sendPrivateMessage(User to, String message) {
        System.out.println("\n" + this.name + " is sending private message to " + to.getName() + ": " + message);
        privateMediator.sendMessage(this, to, message);
    }


    public void receivePrivateMessage(User from, String message) {
        System.out.println("\n[received private message from " + from.getName() + "] : " + message);
    }


    public void sendGroupMessage(String groupId, String message) {
        if (isInGroup(groupId)) {
            groupMediator.sendMessage(this, groupId, message);
        } else {
            System.out.println("\n" + name + " is not in group " + groupId);
        }
    }

    public void receiveGroupMessage(String groupId, User from, String message) {
        System.out.println("[" + name + "] received group message in " + groupId + " from " + from.getName() + ": " + message);
    }
}
