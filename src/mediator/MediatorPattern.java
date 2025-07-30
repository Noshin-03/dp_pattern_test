package mediator;

public class MediatorPattern {
    public static void main(String[] args) {
        PrivateChat privateMediator = new PrivateChat();
        GroupChat groupMediator = new GroupChat();

        User User1 = new User("User1", privateMediator, groupMediator);
        User User2 = new User("User2", privateMediator, groupMediator);
        User User3 = new User("User3", privateMediator, groupMediator);

        groupMediator.createGroup("G-1");
        groupMediator.addUserToGroup(User1, "G-1");
        groupMediator.addUserToGroup(User2, "G-1");

        User1.sendPrivateMessage(User2, "Hi User2");

        User2.sendGroupMessage("G-1", "Hi User1");

        User3.sendGroupMessage("G-1", "Can I join?");
    }
}
