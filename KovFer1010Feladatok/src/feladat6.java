
public class feladat6 {

	public static void main(String[] args) {
		System.out.println("6.feladat:"
				+ "\n\tÍrj programot, amely a paraméterben "
				+ "\n\tmegadott számról eldönti, hogy tökéletes-e!"
				+ "\n\t6 osztói: 1+2+3=6");
		
		int szam=Integer.parseInt(args[0]);
		int osztok=0;
		for (int i = szam-1; i >0; i--) {
			if (szam%i==0) {
				osztok+=i;
			}
		}
		if (osztok==szam) {
			System.out.println("A(z) "+szam+" egy tökéletes szám");
		}else {
			System.out.println("A(z) "+szam+" NEM egy tökéletes szám");
		}
		

	}

}
