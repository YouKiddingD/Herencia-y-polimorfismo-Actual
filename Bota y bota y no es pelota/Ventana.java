import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Ventana extends JFrame
{
   private Lienzo dibujo;
   private Timer tiempo;
   public Ventana(int ancho, int alto)
   {
      this.setSize(ancho,alto);
      EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
      tiempo = new Timer(1000,escuchaTiempo);
      tiempo.start();
      dibujo= new Lienzo();
      this.add(dibujo);
      EscuchadorTeclado esc = new EscuchadorTeclado();
      this.addKeyListener(esc);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    public class EscuchadorTiempo implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           System.out.println("Hola pelota ;)");
       }
   }
   public class EscuchadorTeclado implements KeyListener
   {
      @Override
   public void keyPressed(KeyEvent e)
   {
       System.out.println("All you have to do is...");
       if(e.getKeyChar() == 'd')
          tiempo.stop();
   }
    @Override
   public void keyReleased(KeyEvent e)
   {
       System.out.println("A minute");
   }
    @Override
   public void keyTyped(KeyEvent e)
   {
       System.out.println("Stay");
   }
}
}
