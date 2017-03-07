
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno implements Comparable
{
   protected int creditos;
   
   public Alumno(int c)
   {
       creditos=c;
   }
   
   @Override 
   public int compareTo(Object other)
   {
       Alumno tmp= (Alumno)other;
       if(this.creditos == tmp.creditos)
          return 0;   
       else if(this.creditos < tmp.creditos)
          return -1;
       else
          return 1;
   }
   
   @Override
   public String toString()
   {
       return "Alumno con" + this.creditos + "Creditos ";
   }
}
 