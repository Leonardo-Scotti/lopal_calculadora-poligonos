package br.senai.sp.jandira.calculo.model;

public class Quadrado {
	
	private double lado;
	
	//Método set
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	//Métodos de calculo
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (lado * 2);
		return perimetro;
	}
	
	//Método de exibição
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("    Quadrado    ");
		System.out.println("Lado: " + lado);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("----------------");
	}
}
