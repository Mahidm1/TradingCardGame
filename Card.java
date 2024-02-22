import java.util.Objects;

public class Card implements Comparable<Card> {
    // These are fields of the Card class
    long id;
    String name;
    Rank rank;
    long price;


    public Card(long id, String name, Rank rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    // These are get methods for the fields of the Card class
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public long getPrice() {
        return price;
    }

    // This is a set method for the price field of the Card class
    public void setPrice(long price) {
        this.price = price;
    }


    // This compareTo method defines the natural ordering of Card objects
    @Override
    public int compareTo(Card other) {
        int CompareRank = Integer.compare(rank.ordinal(), other.rank.ordinal());
        if (CompareRank != 0) {
            return CompareRank;
        }
        int CompareName = name.compareTo(other.name);
        if (CompareName != 0) {
            return CompareName;
        }
        return Long.compare(id, other.id);
    }


    // This hashCode method generates a hash code for the Card object
    @Override
    public int hashCode() {
        return Objects.hash(id, name, rank);
    }

    // This boolean method checks if the Card object is equal to another object
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Card other = (Card) obj;
        return id == other.id && Objects.equals(name, other.name) && rank == other.rank;
    }

    // This toString method generates a string representation of the Card object
    @Override
    public String toString() {
        return String.format("Card [id=%d, name=%s, rank=%s, price=%d]", id, name, rank, price);
    }
}
