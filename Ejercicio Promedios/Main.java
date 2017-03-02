
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
       System.out.println(b1.calcularSaldoPromedio());
  
   }
}
