
public class feladat5 {

	public static void main(String[] args) {
		System.out.println("5.feladat:"
				+ "\n\tÍrj programot, mely két paraméterrel működik. "
				+ "\n\tAz első egy karakterlánc, a második pedig egy szám, "
				+ "\n\tamely azt adja meg, hányszor íródjon ki lépcsőzetesen "
				+ "\n\ta képernyőre az első paraméter.\n");

		for (int i = 0; i < Integer.parseInt(args[1]); i++) {
			System.out.print(args[0]+", ");
		}
	}

}
