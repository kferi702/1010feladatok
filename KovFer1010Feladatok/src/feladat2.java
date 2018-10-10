
public class feladat2 {

	public static void main(String[] args) {
		System.out.println("2.feladat:\n\tÍrj programot, "
				+ "mely kiírja egymás mellé az 1 és 20 "
				+ "\n\tközé eső páros számokat");
		
		for (int i = 1; i <= 20; i++) {
			if (i%2==0) {
				System.out.print(i+", ");
			}
		}
	}

}
