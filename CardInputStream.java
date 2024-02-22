import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class CardInputStream extends InputStream {
    private BufferedReader bufferedReader;

    // This is a constructor that takes an InputStream object and initializes a BufferedReader object
    public CardInputStream(InputStream inputStream) {
        this.bufferedReader = new BufferedReader(new java.io.InputStreamReader(inputStream));
    }

    @Override
    public int read() throws IOException {
        return bufferedReader.read();
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }

    // This reads a Card object from the input stream
    public Card readCard() throws IOException {
        String line;

        // This checks if the first line is "CARD", otherwise return null
        if ((line = bufferedReader.readLine()) == null || !line.equals("CARD")) {
            return null;
        }

        long id = Long.parseLong(bufferedReader.readLine());
        String name = bufferedReader.readLine();
        Rank rank = Rank.valueOf(bufferedReader.readLine());
        int lastSalePrice = Integer.parseInt(bufferedReader.readLine());

        return new Card(id, name, rank);
    }

    // This reads a response from the input stream
    public String readResponse() throws IOException {
        return bufferedReader.readLine();
    }
}
