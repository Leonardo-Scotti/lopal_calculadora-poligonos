package br.senai.sp.jandira.calculo.model;

public class Triangulo {
	
	public double base;
	public double altura;
	
	//Métodos setters
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Método de calculo
	public double calcularArea() {
		double area = (base * altura) / 2;
		return area;
	}
	
	//Método de exibição
	public void exibirDados() {
		System.out.println("-----------------");
		System.out.println("    Triângulo    ");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
		System.out.println("----------------");
	}
}
