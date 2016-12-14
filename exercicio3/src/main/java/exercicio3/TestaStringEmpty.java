package exercicio3;

public class TestaStringEmpty {

	public static void main(String[] args) {
		
		String str = " Brasil ";
		String str2 = "";
		
		System.out.println("A String " + str +  " é vazia? " + (str.isEmpty() ? "Sim" : "Não"));
		System.out.println("A String " + str2 +  " é vazia? " + (str2.isEmpty() ? "Sim" : "Não"));

	}

}
