package br.senai.sp.jandira.calculo.model;

public class Quadrado {
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("    Quadrado    ");
		System.out.println("Lado: " + lado);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("----------------");
	}
}
