import java.io.IOException;
import java.util.List;

public class HollomonClientTest {
    public static void main(String[] args) throws IOException {
        HollomonClient client = new HollomonClient();
        List<Card> cards = client.login("user1", "password1");
        if (cards != null) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        client.close();
    }
}
