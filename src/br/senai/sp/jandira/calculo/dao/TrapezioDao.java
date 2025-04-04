package br.senai.sp.jandira.calculo.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo.model.Trapezio;
import br.senai.sp.jandira.calculo.ui.Menu;

public class TrapezioDao {

	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um Trapézio...");
		Trapezio trapezio = new Trapezio();
		
		System.out.print("Digite a medida da base menor: ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Digite a medida da base maior: ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura: ");
		trapezio.setAltura(leitor.nextDouble());
		
		System.out.println();
		trapezio.exibirDados();
		
		Menu.retornar();
		
	}
	
}
