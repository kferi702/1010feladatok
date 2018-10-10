
public class feladat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.feladat:\n\tÍrj programot,"
				+ " amely kiírja a felhasználó által"
				+ " \n\tadott összes paramétert!\n");
		
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]+", ");
		}
	}

}
