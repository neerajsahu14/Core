import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        YouTubeChannel channel = new YouTubeChannel();
        Subscriber Neeraj = new Subscriber("Neeraj");
        Subscriber Dev = new Subscriber("Dev");
        channel.subscriber(Neeraj);
        channel.subscriber(Dev);
        channel.NewVideoUploded();
        channel.unsubscriber(Dev);
        channel.NewVideoUploded();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Click 1 for subscriber");
            System.out.println("Click 2 for new video ");
            System.out.println("Click 3 for Unsubscribe ");
            int count = Integer.parseInt(reader.readLine());
            if (count == 1) {
                String title = reader.readLine();
                Subscriber Devendra = new Subscriber(title);
                channel.subscriber(Devendra);
            } else if (count == 2) {
                channel.NewVideoUploded();
            } else if (count == 3) {
                String title = reader.readLine();
                channel.unsubscriber(channel.findsub(title));
            } else {
                break;
            }
        }
    }
}