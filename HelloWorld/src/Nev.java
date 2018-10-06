
/**
 * 
 * @author Kovács Ferenc
 *
 */
public class Nev {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {

		/*
		 * TODO Auto-generated method stub
		 * 
		 * //System.out.println("Hello World"); //System.out.println(args[0]);
		 * //System.out.println(args[1]); int i=1; double j=1.2; char s='s'; String
		 * st="string"; System.out.println(i+" "+j+" "+s+" "+st);
		 * 
		 * System.out.println(Math.PI);
		 * 
		 * boolean igaze =true; String szo =igaze ? "igaz" : "hamis";
		 * 
		 * System.out.println(szo);
		 */

		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		/*
		int terfogat = a * b * c;
		int felszin = 2 * (a * b + a * c + b * c);
		System.out.println("a= " + a + "\nb= " + b + "\nc= " + c);
		System.out.println("Térfogat: " + terfogat);
		System.out.println("Felszin: " + felszin);
		*/
		System.out.println("Összeg: "+(a+b));
		System.out.println("Külömbség: "+(a-b));
		System.out.println("Szorzat: "+(a*b));
		System.out.println("Szorzat: "+(a/b));
		
		//szamtani közep
		int ossz=0;
		for (int i = 0; i < args.length; i++) {
			ossz+=Integer.parseInt(args[i]);
		}
		double atlag=ossz/args.length;
		System.out.println("Átlag: "+atlag);
		
		//másodfokú egyenletet megoldó program
		
		double x1= (-b+Math.sqrt(b*b-4*(a*c)))/(2*a);
		double x2= (-b-Math.sqrt(b*b-4*(a*c)))/(2*a);
		
		System.out.println("x1: "+x1);
		System.out.println("x2: "+x2);
		

	}

}
