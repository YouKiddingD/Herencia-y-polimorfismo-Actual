import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Lienzo extends JPanel
{
   private Pelota pelota;
   public Lienzo()
   {
     pelota= new Pelota(400,300,35);
   }
  
   @Override
   public void paintComponent(Graphics g)
   {
       pelota.dibujate(g);
   }
   }
