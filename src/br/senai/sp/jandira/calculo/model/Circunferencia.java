package br.senai.sp.jandira.calculo.model;

public class Circunferencia {
	
	double raio;
	
	//Método Set
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	//Método de calculo
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	
	//Método de exibição
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println(" Circunferência ");
		System.out.println("Raio: " + raio);
		System.out.println("Área: " + calcularArea());
		System.out.println("----------------");
	}
}
