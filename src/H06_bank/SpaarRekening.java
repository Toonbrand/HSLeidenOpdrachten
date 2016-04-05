package H06_bank;

public class SpaarRekening extends Rekening 
{
  private double percentage;

  public SpaarRekening( String nummer, double percentage ) 
  {
    this.rekeningnummer = nummer;
    this.saldo = 0.0;
    this.percentage = percentage;
  }

  public void print() 
  {
    super.print();
    System.out.println( "Rente: " + percentage + "%" );
  }

  public void schrijfRenteBij() 
  {
    double rente = saldo * percentage / 100;
    saldo += rente;
  }
}
