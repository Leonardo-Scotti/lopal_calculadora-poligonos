package br.senai.sp.jandira.calculo.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo.model.Triangulo;
import br.senai.sp.jandira.calculo.ui.Menu;

public class TrianguloDao {

	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um Triângulo...");
		Triangulo triangulo = new Triangulo();
		
		System.out.print("Digite a medida da base: ");
		triangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura: ");
		triangulo.setAltura(leitor.nextDouble());
		
		System.out.println();
		triangulo.exibirDados();
		
		Menu.retornar();
		
		leitor.close();
	}
		
}
