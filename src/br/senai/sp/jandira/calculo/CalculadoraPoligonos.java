package br.senai.sp.jandira.calculo;

import java.util.Scanner;

import br.senai.sp.jandira.calculo.model.Circunferencia;
import br.senai.sp.jandira.calculo.model.Quadrado;
import br.senai.sp.jandira.calculo.model.Retangulo;
import br.senai.sp.jandira.calculo.model.Trapezio;
import br.senai.sp.jandira.calculo.model.Triangulo;

public class CalculadoraPoligonos {
	
	public static void main(String[] args) {
		
		//Criação dos objetos
		//Quadrado
		Quadrado quadrado1 = new Quadrado();
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = leitor.nextDouble();
		leitor.nextLine();
		
		System.out.print("Qual é o seu nome? ");
		String nome = leitor.nextLine();
		
		System.out.println("Olá, " + nome);
		
		quadrado1.setLado(lado);
		quadrado1.exibirDados();
	
	}

}
