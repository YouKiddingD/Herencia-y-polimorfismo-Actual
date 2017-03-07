
public class Main
{
   public static void main(String [] args)
   {
       Banco b1 =  new Banco();
       Banco b2 =  new Banco();
       Banco b3 =  new Banco();
       CuentaBancaria c1=new CuentaBancaria(100);
       CuentaBancaria c2=new CuentaBancaria(200);
       CuentaBancaria c3=new CuentaBancaria(300);
       b1.agregarCuenta(c1);
       b1.agregarCuenta(c2);
       b1.agregarCuenta(c3);
       arrCuentas= new CuentaBancaria[c1.size];
       arrCuentas=c1.toArray(arrCuentas);
       System.out.println(c1.getMedicion(arrCuentas));
       Planeta p1= new Planeta();
       Pais pa1=new Pais(25000000);
       Pais pa2=new Pais(32000000);
       Pais pa3=new Pais(94000000);
       p1.agregarPais(pa1);
       p1.agregarPais(pa2);
       p1.agregarPais(pa3);
       System.out.println(p1.calculaPromedioHabitantes());
   }
}
