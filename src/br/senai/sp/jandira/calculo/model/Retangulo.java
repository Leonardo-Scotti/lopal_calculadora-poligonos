package br.senai.sp.jandira.calculo.model;

public class Retangulo {
	
	public double base;
	public double altura;
	
	//Métodos set
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Métodos de calculo
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	//Método de exibição
	public void exibirDados() {
		System.out.println("-----------------");
		System.out.println("    Retângulo    ");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("----------------");
	}
}
