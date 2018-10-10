
public class feladat8 {

	public static void main(String[] args) {
		System.out.println("8.feladat:"
				+ "\n\tLegyen a paraméter egy 100 és 9999 közé eső szám! "
				+ "\n\tÍrasd ki a képernyőre a számjegyek összegét! "
				+ "\n\tA megoldáshoz használj ciklust!\n");
		
		String szam=Integer.toString((int)(Math.random()*9999)+100);
		
		System.out.println("Random szám: "+szam);
		
		int[] szamok=new int[4];
		
		int osszeg=0;
		for (int i = 0; i < szamok.length; i++) {
			szamok[i]=Integer.parseInt(szam.substring(i,i+1));
			osszeg+=szamok[i];
		}
		System.out.println("Összege: "+osszeg);
		
		


	}

}
