import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    List<Observer> subscribers = new ArrayList<>();

    Observer findsub(String name) {
        for (Observer subscriber : subscribers) {
            if (subscriber.getName().equals(name)) {
                return subscriber;
            }
        }
        return null;
    }
    @Override
    public void NewVideoUploded() {
        for (Observer subscriber : subscribers) {
            subscriber.notified();
        }

    }

    @Override
    public void subscriber(Observer ob) {
        this.subscribers.add(ob);

    }

    @Override
    public void unsubscriber(Observer ob) {
        this.subscribers.remove(ob);

    }

}
