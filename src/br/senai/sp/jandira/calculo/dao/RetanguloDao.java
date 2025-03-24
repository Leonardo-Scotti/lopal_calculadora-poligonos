package br.senai.sp.jandira.calculo.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo.model.Retangulo;
import br.senai.sp.jandira.calculo.ui.Menu;

public class RetanguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um Retângulo...");
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a medida da base: ");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura: ");
		retangulo.setAltura(leitor.nextDouble());
		
		System.out.println();
		retangulo.exibirDados();
		
		Menu.retornar();
		
		leitor.close();
	}
	
}
