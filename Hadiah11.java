 import java.awt.*;
  public class Hadiah11 extends Panel{
Hadiah11(){
}
public void paint (Graphics g) {
g.drawString("Ronaldo Yusuf",30,430);
g.setColor(Color.BLUE);
g.fillRect(0, 250, 350, 100);
g.fillRect(0, 200, 250, 60);
g.setColor(Color.RED);
g.fillArc(30,300,100,100,0,360);
g.fillArc(200,300,100,100,0,360);


      }
public static void main(String[] args) {
Frame f = new Frame ("Testing Graphics Panel");
 Hadiah11 gp = new Hadiah11();
  f.add (gp);
   f.setSize (900, 900); 
   f. setVisible(true);
   }
   }