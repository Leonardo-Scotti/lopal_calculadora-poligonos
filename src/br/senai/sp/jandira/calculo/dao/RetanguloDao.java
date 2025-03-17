package br.senai.sp.jandira.calculo.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo.model.Retangulo;

public class RetanguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um Retângulo...");
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a medida da base: ");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.println("Digite a medida da altura: ");
		retangulo.setAltura(leitor.nextDouble());
		
		retangulo.exibirDados();
	}
	
}
