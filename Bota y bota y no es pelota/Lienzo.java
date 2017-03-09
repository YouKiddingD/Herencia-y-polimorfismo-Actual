import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class Lienzo extends JPanel
{
   private Pelota pelota;
   public Lienzo()
   {
     pelota= new Pelota(400,300,35);
     EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
     Timer tiempo = new Timer(1000,escuchaTiempo);
     tiempo.start();
   }
   
   @Override
   public void paintComponent(Graphics g)
   {
       pelota.dibujate(g);
   }
   
   public class EscuchadorTiempo implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           System.out.println("Hola pelota ;)");
       }
   }
}
