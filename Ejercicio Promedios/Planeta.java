import java.util.ArrayList; 
public class Planeta
{
   ArrayList<Pais> p;
   public Planeta()
   {
       p=new ArrayList<Pais>();
   }
   public void agregarPais(Pais pa)
   {
     p.add(pa);
   }
   public float calculaPromedioHabitantes()
   {
       float prom=0;
       int i=0;
       for(Pais pa:p)
       {
           prom=prom+pa.habitantes;
           i++;
       }
       prom=prom/i;
       return prom;
   }
}
