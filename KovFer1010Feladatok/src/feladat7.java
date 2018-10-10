
public class feladat7 {

	public static void main(String[] args) {
		System.out.println("7.feladat:"
				+ "\n\tKészíts programot, amely a paraméterben megadott "
				+ "\n\ttetszőleges számú paraméternek "
				+ "\n\tszámítja ki a számtani közepét!");
		
		int osszeg=0;
		int kozep= 0;
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]+", ");
			
			osszeg+=Integer.parseInt(args[i]);
		}
		System.out.println(" Számok számtani közepe: "+(osszeg/args.length));
	}

}
