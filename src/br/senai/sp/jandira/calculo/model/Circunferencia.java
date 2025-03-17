package br.senai.sp.jandira.calculo.model;

public class Circunferencia {
	
	double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println(" Circunferência ");
		System.out.println("Raio: " + raio);
		System.out.println("Área: " + calcularArea());
		System.out.println("----------------");
	}
}
