public class EvenOddPairs {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x += 2) {
            for (int y = 1; y <= 10; y += 2) {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
}
