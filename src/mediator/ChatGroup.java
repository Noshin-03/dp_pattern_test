package mediator;

import java.util.*;

public class ChatGroup {
    private String id;
    private List<User> users = new ArrayList<>();

    public ChatGroup(String id) {
        this.id = id;
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public String getId() {
        return id;
    }
}
