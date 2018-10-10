import java.util.*;


public class feladat10 {

	public static void main(String[] args) {
		System.out.println("10.feladat:"
				+ "\n\tRajzoltass a képernyőre csillagokkal olyan téglalapot, "
				+ "\n\tmelynek magasságát és szélességét paraméterben adhatjuk meg. "
				+ "\n\tHa nem adunk meg paramétereket, az alapértelmezett magasság "
				+ "\n\tés szélesség 5 csillag.");

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Kérem a téglalap magasságát: ");
		int mag=sc.nextInt();
		System.out.print("Kérem a téglalap szélességét: ");
		int szel=sc.nextInt();
	
		for (int i = 0; i < mag; i++) {
			for (int j = 0; j < szel; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
