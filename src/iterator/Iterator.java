package iterator;

import java.util.Arrays;

public class Iterator {
    public static void main(String[] args) {
        FaceBook facebook = new FaceBook();

        facebook.addFriends("1", Arrays.asList(
                new Profile("2", "friend2@gmail.com"),
                new Profile("3", "friend3@gmail.com")
                ));

        SocialSpammer spammer = new SocialSpammer();
        Application app = new Application(spammer, facebook);

        app.sendSpamToFriends("1");

        facebook.addCoworkers("1", Arrays.asList(
                new Profile("4", "coworker@gmail.com")
        ));

        app.sendSpamToCoworkers("1");
    }
}
