import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
//a class used to store a card data(the image is not stored but its path is)
public class Card extends JPanel {
    //declaration of num and suit and initialization of shown as true
    String num;
    char suit;
    boolean shown=true;
    //calling of vars to store in num and suit
    Card(char suit,String i){
        this.suit = suit;
        this.num=i;
    }
    //calling of no vars to store back card
    Card(){
        shown=false;
    }
    //setting up bound to the size of cards
    void setBounds(int x,int y,int dim){
        this.setBounds(x, y, dim, (int)(1.452*dim));
        this.repaint();
    }
    //flipping the currant state of shown(to show back card)
    void flip(){
        shown=!shown;
        this.repaint();
    }
    //overriding the paint method to setup the image of the card
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        if (shown) {
            g2d.drawImage(new ImageIcon("src\\resource\\"+num+"-"+suit+".png").getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
        }
        else{
            g2d.drawImage(new ImageIcon("src\\resource\\BACK.png").getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
}
