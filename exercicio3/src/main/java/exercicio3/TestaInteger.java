package exercicio3;

public class TestaInteger {

	public static void main(String[] args) {

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1 == x2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		String invalidString = "a";
		String validString = "1";
		
		System.out.println(Integer.parseInt(validString));
		
		// Acontecerá uma java.lang.NumberFormatException
		System.out.println(Integer.parseInt(invalidString));

	}

}
