package ChainofResponsibility;
import java.util.Set;

public class CacheHandler extends Handler {
    private Set<String> prevRequests;

    public CacheHandler(Set<String> requests) {
        this.prevRequests = prevRequests;
    }

    @Override
    public boolean handle(Request request) {
        if (prevRequests != null && prevRequests.contains(request.requestId)) {
            System.out.println("Cache Hit");
            return true;
        }

        System.out.println("Cache Miss");
        return next != null && next.handle(request);
    }
}
