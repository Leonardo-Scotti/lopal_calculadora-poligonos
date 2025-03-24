package br.senai.sp.jandira.calculo.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo.model.Circunferencia;

public class CircunferenciaDao {

	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando uma Circunferência...");
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.print("Digite a medida do raio: ");
		circunferencia.setRaio(leitor.nextDouble());
		
		System.out.println();
		circunferencia.exibirDados();
		
		leitor.close();
	}
	
}
