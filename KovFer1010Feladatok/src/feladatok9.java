
public class feladatok9 {

	public static void main(String[] args) {
		System.out.println("9.feladat:"
				+ "\n\tÍrj programot, amely kirajzolja az amerikai zászlót! "
				+ "\n\t(A bal felső sarokban csillagok, a többi részen kötőjelek.) "
				+ "\n\tA megoldáshoz használj egymásba ágyazott ciklusokat!\n");
		
		for (int i = 0; i < 10; i++) {
			if (i==0||i==2||i==4){
				for (int j = 0; j < 7; j++) {
					System.out.print("* ");
				}
				for (int j = 0; j < 20; j++) {
					System.out.print("==");
				}
				System.out.print("\n");
			}
			else if (i==1||i==3){
				for (int j = 0; j < 6; j++) {
					System.out.print(" *");
				}
				System.out.print("  ");
				for (int j = 0; j < 20; j++) {
					System.out.print("==");
				}
				System.out.print("\n");
			}
			else {
				for (int j = 0; j < 27; j++) {
					System.out.print("==");
			}
				System.out.print("\n");
			
		}
		
		}
	}
}


