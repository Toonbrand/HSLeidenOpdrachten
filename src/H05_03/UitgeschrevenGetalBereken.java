package H05_03;

import javax.swing.*;

public class UitgeschrevenGetalBereken extends JPanel
{
	private String[] klein ={"", "een", "twee", "drie", "vier", "vijf","zes","zeven","acht","negen","tien","elf","twaalf","dertien","veertien","vijftien","zestien","zeventien","achtien","negentien"};
	private String[] groot ={"","tien","twintig","dertig","veertig","vijftig","zestig","zeventig","tachtig","negentig"};
	private int invoer;
	private String honderd, duizend, millioen;
	
	public void setInvoer(int nieuweInvoer)
	{
		invoer = nieuweInvoer;
	}
	
	public String getUitvoer()
	{
		int eerste = invoer % 10 ;
		int tweede = (invoer % 100)/10;
		int derde = (invoer % 1000)/100;
		int vierde = (invoer % 10000)/1000;
		int vijfde = (invoer % 100000)/10000;
		int zesde = (invoer % 1000000)/100000;
		int zevende = (invoer % 10000000)/1000000;
		int achtste = (invoer % 100000000)/10000000;
		int negende = (invoer % 1000000000)/100000000;

		int eerste2 = invoer % 100;
		int tweede2 = invoer % 100000;
		int derde2 =  invoer % 100000000;
		
		if(tweede < 2)
		{honderd = (klein[derde]+"honderd"+klein[eerste2]);}
		else
		{honderd = (klein[derde]+"honderd"+klein[eerste]+ "en" + groot[tweede]);}
		
		if(vijfde < 2)
		{duizend = (klein[zesde]+"honderd" +klein[tweede2]+ " duizend ");}
		else
		{duizend = (klein[zesde]+"honderd" +klein[vierde]+ "en" + groot[vijfde]+ "duizend");}
		
		if(zevende < 2)
		{millioen = (klein[negende]+"honderd" +klein[derde2]+ " miljoen ");}
		else
		{millioen = (klein[negende]+"honderd" +klein[zevende]+ "en" + groot[achtste]+ "miljoen");}
		
		return (millioen+duizend+honderd);
	}
}
