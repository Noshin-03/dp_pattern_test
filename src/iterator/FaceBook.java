package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaceBook implements SocialNetwork {
    private Map<String, List<Profile>> friends = new HashMap<>();
    private Map<String, List<Profile>> coworkers = new HashMap<>();

    public void addFriends(String profileId, List<Profile> friendList) {
        friends.put(profileId, friendList);
    }

    public void addCoworkers(String profileId, List<Profile> coworkerList) {
        coworkers.put(profileId, coworkerList);
    }

    public List<Profile> requestProfiles(String profileId, String type) {
        if (type.equals("friends")) {
            return friends.getOrDefault(profileId, new ArrayList<>());
        } else {
            return coworkers.getOrDefault(profileId, new ArrayList<>());
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }
}
