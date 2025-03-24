package br.senai.sp.jandira.calculo.model;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	//Métodos set
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Método de calculo 
	public double calcularArea() {
		double area = ((baseMaior + baseMenor) * altura) / 2;
		return area;
	}
	
	//Método de exibição
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("    Trapézio    ");
		System.out.println("Base Maior: " + baseMaior);
		System.out.println("Base Menor: " + baseMenor);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea());
		System.out.println("----------------");
	}
}
