import java.util.Scanner;

public class HarmasDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		*/
		/**
		 * Első Feladat
		 */
		/*
		 * System.out.println("1. feladat paritás"); if (a % 2 == 0) {
		 * System.out.println("A(z) " + a + " páros szám!"); } else {
		 * System.out.println("A(z) " + a + " páratlan szám!"); }
		 */
		/**
		 * Második Feladat
		 */
		/*
		 * System.out.println("\n2. Feladat: osztható e"); System.out.println("A(z) " +
		 * a + " szám:"); if (a % 2 == 0) { System.out.println("Osztható kettővel."); }
		 * else { System.out.println("Nem oszthat kettővel."); } if (a % 3 == 0) {
		 * System.out.println("Osztható hárommal."); } else {
		 * System.out.println("Nem oszthat hárommal."); } if (a % 5 == 0) {
		 * System.out.println("Osztható öttel."); } else {
		 * System.out.println("Nem oszthat öttel."); }
		 */

		/**
		 * Harmadik feladat
		 */
		/*
		 * System.out.println("\n3. Feladat: háromszög szerkeszthető e");
		 * System.out.print("A(z) "+a+", "+b+", "+c+" oldalű háromszög "); if (a<(b+c)
		 * && b<(a+c) && c<(a+b)) { System.out.println("szerkeszthető."); }else {
		 * System.out.println("nem szerkeszthető."); }
		 */
		/**
		 * Negyedik Feladat
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("\n4. Feladat: Hány jegyű szám");
		 * 
		 * System.out.println("Kérek egy számot 1 és 1.000.000 között"); int be =
		 * sc.nextInt(); if (be > 1000000) { System.out.print(" Túl nagy szám."); be =
		 * sc.nextInt(); } else {
		 * 
		 * System.out.print("A bekért szám ");
		 * 
		 * if (be == 1000000) { System.out.print(" hétszámjegyű."); } else if (be >=
		 * 100000) { System.out.print(" hatszámjegyű."); } else if (be >= 10000) {
		 * System.out.print(" ötszámjegyű."); } else if (be >= 1000) {
		 * System.out.print(" négy."); } else if (be >= 100) {
		 * System.out.print(" háromszámjegyű."); } else if (be >= 10) {
		 * System.out.print(" kétszámjegyű."); } else {
		 * System.out.print(" egyszámjegyű."); } }
		 */
		/**
		 * Ötödik feladat
		 */
		/*
		 * System.out.println("\n5. Feladat: Melyik a nagyobb"); try {
		 * System.out.print("Kérek egy számot: "); int bea = sc.nextInt();
		 * System.out.print("Kérek mégegy számot: "); int beb = sc.nextInt();
		 * 
		 * if (bea > beb) { System.out.println("A(z) " + bea + " nagyobb mint a " +
		 * beb); } else if (beb > bea) { System.out.println("A(z) " + bea +
		 * " nagyobb mint a " + beb); } else { System.out.println("A(z) " + bea +
		 * " és a(z) " + beb + " ugyanakkora szám"); }
		 * 
		 * } catch (Exception e) { System.out.println("Hibás beviteli adatok!"); }
		 */
		/**
		 * Hatodik feladat
		 */
		/*
		 * System.out.println("\n6. Feladat"); System.out.println("Kérek egy számot");
		 * int be=sc.nextInt(); if (be>10) { System.out.println("Túl nagy szám"); }
		 * 
		 * System.out.println("Visszaszámolás"); switch (be) { case 10:
		 * System.out.println(be); be-=1; case 9: System.out.println(be); be-=1; case 8:
		 * System.out.println(be); be-=1; case 7: System.out.println(be); be-=1; case 6:
		 * System.out.println(be); be-=1; case 5: System.out.println(be); be-=1; case 4:
		 * System.out.println(be); be-=1; case 3: System.out.println(be); be-=1; case 2:
		 * System.out.println(be); be-=1; case 1: System.out.println(be); break;
		 * 
		 * }
		 */
		/**
		 * Hetedik feladat
		 */
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			
			if (a * a == 0) {
				System.out.println("Az egyelnet nem másodfokú!");
			} else if ((b * b - 4 * (a * c)) < 0) {
				System.out.println("Az egyenletnek nincs megoldása!");
			} else {
				double x1 = (-b + Math.sqrt(b * b - 4 * (a * c))) / (2 * a);
				double x2 = (-b - Math.sqrt(b * b - 4 * (a * c))) / (2 * a);

				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nincs elég szám egy másodfokú egyenlethez!");
		}
	}

}
