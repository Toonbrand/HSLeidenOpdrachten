package H06_bank;

public class BankTest
{
  public static void main( String[] args )
  {
    Bank javaBank = new Bank();

    SpaarRekening rekening1 = new SpaarRekening( "123", 3.0 );
    javaBank.voegRekeningToe( rekening1 );
 
    BankRekening rekening2 = new BankRekening( "987", 500 );
    javaBank.voegRekeningToe( rekening2 );

    rekening1.stort( 100 );
    rekening1.schrijfRenteBij();
    rekening2.neemOp( 45 );

    javaBank.printOverzicht();
  }
}
