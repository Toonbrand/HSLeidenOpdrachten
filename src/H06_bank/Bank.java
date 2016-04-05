package H06_bank;

import java.util.*;

public class Bank
{
  private ArrayList < Rekening > lijst;

  public Bank() 
  {
	lijst = new ArrayList < Rekening >();
  }

  public void voegRekeningToe( Rekening r )
  {
    lijst.add( r );
  }

  public void printOverzicht()
  {
    for ( Rekening r : lijst )
    	r.print();
  }
}
