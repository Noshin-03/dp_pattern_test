package iterator;

import java.util.List;
import java.util.ArrayList;

public class FacebookIterator implements ProfileIterator {
    private FaceBook facebook;
    private String profileId;
    private String type;

    private int currentPosition = 0;
    private List<Profile> cache = new ArrayList<>();

    public FacebookIterator(FaceBook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache.isEmpty()) {
            List<Profile> profiles = facebook.requestProfiles(profileId, type);
            cache.addAll(profiles);
        }
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.size();
    }

    @Override
    public Profile getNext() {
        if (!hasMore()) {
            return null;
        }
        return cache.get(currentPosition++);
    }
}
