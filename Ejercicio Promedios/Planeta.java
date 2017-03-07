import java.util.ArrayList; 
public class Planeta implements Medible
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
   public float getMedicion(Medible objeto[])
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
