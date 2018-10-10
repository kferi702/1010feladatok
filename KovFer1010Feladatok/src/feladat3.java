
public class feladat3 {

	public static void main(String[] args) {
		System.out.println("3.feladat:"
				+ "\n\tMódosítsuk az előző programot úgy, "
				+ "\n\thogy ne az 1 és 20 közé eső páros,"
				+ "\n\thanem a paraméterként megadott két szám "
				+ "\n\tközé eső 3-mal osztható számokat listázzuk ki!\n");
		
		for (int i = Integer.parseInt(args[0]); i < Integer.parseInt(args[1]); i++) {
			if(i%3==0) {
				System.out.print(i+", ");
			}
		}
	}

}
