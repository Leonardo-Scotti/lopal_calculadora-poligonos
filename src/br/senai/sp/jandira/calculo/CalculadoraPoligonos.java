package br.senai.sp.jandira.calculo;

import br.senai.sp.jandira.calculo.ui.Menu;

public class CalculadoraPoligonos {

	public static void main(String[] args) {

		// Looping / Laços de repetição
//		int contador = 1;
//		while(contador <= 10) {
//			System.out.println("SENAI JANDIRA! - " + contador);
//			contador = contador + 1;
//		}
//		
//		String resposta = "s";
//		while (resposta.equals("s")) {
//			System.out.println("Estamos dando voltas!");
//			System.out.println("Gostaria de dar mais uma volta (s/n)?");
//			Scanner leitor = new Scanner(System.in);
//			resposta = leitor.next();
//		}

		System.out.println("- TABUADA DO 9 -");
		int i = 0;
		while (i <= 10) {
			int resultado = 9 * i;
			System.out.println("9 x " + i + " = " + resultado);
			i++;
		}

		// Menu.criarMenu();
	}

}
