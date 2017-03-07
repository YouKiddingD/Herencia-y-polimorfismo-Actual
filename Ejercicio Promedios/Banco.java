import java.util.ArrayList;

public class Banco implements Medible
{
  ArrayList <CuentaBancaria> cuentas;
  public Banco()
  {
  cuentas= new ArrayList<CuentaBancaria>();
  }
  
  public void agregarCuenta(CuentaBancaria b)
  {
      cuentas.add(b);
  }
  
  public float getMedicion(Medible obj)
  {
      float prom=0;
      int i=0;
      for(CuentaBancaria b:cuentas)
      {
          prom=prom+b.saldo;
          i++;
      }
      prom=prom/i;
      return prom;
  }
}
