package exercicio3;

public class TestaCharAt {
	public static void main(String[] args) {
		String texto = "Alura";
		int posicao = 0;
		while (posicao < texto.length()) {
			System.out.println(texto.charAt(posicao));
			posicao++;
		}
	}
}

class TestaReverseCharAt {
	public static void main(String[] args) {
		String texto = "anotaram a data da maratona";
		String textoAoContrario = "";
		
		int posicao = texto.length();
		while (posicao != 0) {
			textoAoContrario += texto.charAt(--posicao);
		}
		
		System.out.println(textoAoContrario);
	}
}

class TestaSplit {
	public static void main(String[] args) {
		String[] partesString = "Socorram-me, subi no ônibus em Marrocos".split(" ");
		String textoAoContrario = "";
		
		int posicao = partesString.length;
		while (posicao != 0) {
			textoAoContrario += (partesString[--posicao] + " ");
		}
		
		System.out.println(textoAoContrario);
	}
}