import java.io.*;
import java.net.*;
import java.util.*;

public class HollomonClient {

// Define class members
private Socket socket;
private InputStream is;
private OutputStream os;

// This is a constructor that takes in server name and port number and throws IOException
public HollomonClient(String server, int port) throws IOException {
    
    socket = new Socket(server, port);
    
    is = socket.getInputStream();
    os = socket.getOutputStream();
}

public HollomonClient() {
    
}

// This is a method named "login" that takes in username and password and returns a list of Card objects, or null if login failed
public List<Card> login(String username, String password) throws IOException {
    
    String login = username.toLowerCase() + "\n" + password + "\n";
    
    os.write(login.getBytes());
    os.flush();

    // This reads the response from server
    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    String response = reader.readLine();

    // If login was successful, it should read Card objects from server and return as a sorted list
    if (response.startsWith("User " + username.toLowerCase() + " logged in successfully.")) {
        CardInputStream cardStream = new CardInputStream(is);
        List<Card> cardList = new ArrayList<>();
        Card card;
        while ((card = cardStream.readCard()) != null) {
            cardList.add(card);
        }
        Collections.sort(cardList);
        return cardList;
    } 
    // If login failed, return null
    else {
        return null;
    }
}

// This is a method named "close" that closes all streams and the socket
public void close() throws IOException {
    if (is != null) {
        is.close();
    }
    if (os != null) {
        os.close();
    }
    if (socket != null) {
        socket.close();
    }
}
}