package br.senai.sp.jandira.calculo;

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
		quadrado1.setLado(5);
		quadrado1.exibirDados();
		
		//Retângulo
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setAltura(2);
		retangulo1.setBase(5);
		retangulo1.exibirDados();
		
		//Triângulo
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAltura(5);
		triangulo1.setBase(8);
		triangulo1.exibirDados();
		
		//Trapézio
		Trapezio trapezio1 = new Trapezio();
		trapezio1.setBaseMaior(8);
		trapezio1.setBaseMenor(5);
		trapezio1.setAltura(4);
		trapezio1.exibirDados();
		
		//Circunferência
		Circunferencia circulo1 = new Circunferencia();
		circulo1.setRaio(5);
		circulo1.exibirDados();
	}

}
