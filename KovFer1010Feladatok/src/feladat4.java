
public class feladat4 {

	public static void main(String[] args) {
		System.out.println("4.feladat:"
				+ "\n\tÍrj olyan programot, amely kiírja a paraméterként "
				+ "\n\tmegadott szám osztóit! Ha a szám prím, erről is "
				+ "\n\ttájékoztassa a felhasználót! "
				+ "A megoldáshoz használj for-ciklust!");

		for (int i = Integer.parseInt(args[0]); i > 0; i--) {
			if(Integer.parseInt(args[0])%i==0) {
				System.out.print(i+", ");
			}
		}
	}

}
