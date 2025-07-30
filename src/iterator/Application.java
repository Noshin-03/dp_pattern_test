package iterator;

import java.util.*;

public class Application {
    private SocialSpammer spammer;
    private SocialNetwork network;

    public Application(SocialSpammer spammer, SocialNetwork network) {
        this.spammer = spammer;
        this.network = network;
    }

    public void sendSpamToFriends(String profileId) {
        ProfileIterator friendsIterator = network.createFriendsIterator(profileId);
        spammer.send(friendsIterator, "Hello Friend!");
    }

    public void sendSpamToCoworkers(String profileId) {
        ProfileIterator coworkersIterator = network.createCoworkersIterator(profileId);
        spammer.send(coworkersIterator, "Hello Coworker!");
    }
}