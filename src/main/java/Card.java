public class Card implements Comparable<Card> {

    private String name, suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getName() {
        return this.name;
    }

    public String getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }

    public int indexOfString(String[] arr, String str) {
        for (int i = 0; i < arr.length; ++i) if (arr[i].equals(str)) return i;
        return -1;
    }

    @Override
    public int compareTo(Card card) {
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        return 13*indexOfString(suits, this.suit) + indexOfString(names, this.name) - 13*card.indexOfString(suits, card.getSuit()) - card.indexOfString(names, card.getName());
    }

}