
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class App {
    //global var as deck, set global to change deck in methods while returning a card from deck
    static ArrayList<Card> deck = new ArrayList<Card>();
    public static void main(String[] args) throws Exception {
        //making empty vars to change later
        JFrame frame = new JFrame();
        Card[] table= new Card[5];
        //setting up frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setVisible(true);
        //adding each card to deck
        String numbers[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (char suit : "HDSC".toCharArray()) {
            for (String number : numbers) {
                deck.add(new Card(suit, number));
            }
        }
    }
    //take random card is used to take a card from the deck and to caller
    static Card takeRandomCard(){
        //using a random number to get an int within the limits and remove from deck 
        Random random = new Random();
        int x=random.nextInt(deck.size());
        Card result = (Card) deck.get(x);
        deck.remove(x);
        return result;
    }
}
