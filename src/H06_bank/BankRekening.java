package H06_bank;

public class BankRekening extends Rekening 
{
  public BankRekening( String nummer, double inleg ) 
  {
    rekeningnummer = nummer;
    saldo = inleg;
  }

 public BankRekening( String nummer ) 
  {
    this.rekeningnummer = nummer;
    this.saldo = 0;
  }

  public void print() 
  {
    super.print();
    System.out.println( "----------------" );
  }
}

