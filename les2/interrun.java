import java.util.Scanner;

public class  interrun { 

	public static void main (String[] arg) {
		Scanner reader = new Scanner (System.in);
		try {
			calculator calc = new calculator ();		
			String exit = "n";
			while (!exit.equals("y")) {
				System.out.println("1 chislo: ");
				String first = reader.next();
				System.out.println("2 chislo: ");
				String second = reader.next();

				calc.add(Integer.valueOf(first), Integer.valueOf(second) );
				System.out.println ("Res=" + calc.getResult());
				calc.clearResult();
				System.out.println("Exit: y/n");
				exit = reader.next ();
			}
		} finally {
			reader.close();
		}
	}

}

