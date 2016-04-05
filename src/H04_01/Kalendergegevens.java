package H04_01;

public class Kalendergegevens 
{
	public int getAantalDagenInMaand(int maand, int jaar)
	{
		final int APRIL=4, JUNI=6, SEPTEMBER=9, NOVEMBER=11, FEBRUARI=2;
		int aantalDagen = 31;
		if (maand == APRIL || maand == JUNI || maand == SEPTEMBER || maand == NOVEMBER)
		{
			aantalDagen=30;
		}
		else if (maand == FEBRUARI)
		{
			aantalDagen = 28;
			if (isSchrikkeljaar(jaar))
			{
				aantalDagen = 29;
			}
		}
		return aantalDagen;
	}
	
	public boolean isSchrikkeljaar(int jaartal)
	{
		return ((jaartal % 4 == 0) && (jaartal % 100 != 0)) || (jaartal % 400 == 0);
	}
	
	public String getDagVanDeWeek(int dag, int maand, int jaar)
	{
		if (maand > 2)
		{
			maand = maand - 2;
		}
		else
		{
			maand = maand + 10;
			jaar = jaar - 1;
		}
		
		int eersteTwee = jaar / 100;
		int laatsteTwee = jaar-(eersteTwee*100);
		int a = (13*maand-1)/5;
		int b = (jaar / 4);
		int c = eersteTwee / 4;
		int d = a + b + c + dag + laatsteTwee + - 2 * eersteTwee + 700;
		int weekdag = d%7;
		String uitkomst = "error klote Toon";
		
		if (weekdag == 0)
		{uitkomst = "Zondag";}
		else if (weekdag == 1)
		{uitkomst = "Maandag";}
		else if (weekdag == 2)
		{uitkomst = "Dinsdag";}
		else if (weekdag == 3)
		{uitkomst = "Woensdag";}
		else if (weekdag == 4)
		{uitkomst = "Donderdag";}
		else if (weekdag == 5)
		{uitkomst = "Vrijdag";}
		else if (weekdag == 6)
		{uitkomst = "Zaterdag";}
		return uitkomst;
	}
}
