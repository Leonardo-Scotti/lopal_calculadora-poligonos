package br.senai.sp.jandira.calculo.ui;

import java.util.Scanner;

import br.senai.sp.jandira.calculo.dao.CircunferenciaDao;
import br.senai.sp.jandira.calculo.dao.QuadradoDao;
import br.senai.sp.jandira.calculo.dao.RetanguloDao;
import br.senai.sp.jandira.calculo.dao.TrapezioDao;
import br.senai.sp.jandira.calculo.dao.TrianguloDao;

public class Menu {
	
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("------------------------");
		System.out.print("Escolha uma opção (1-5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
		} else if (opcao == 3) {
			TrianguloDao.criar();
		} else if (opcao == 4) {
			TrapezioDao.criar();
		} else if (opcao == 5) {
			CircunferenciaDao.criar();
		} else {
			System.out.println("Opção inválida! Você deve escolher uma opção entre 1 e 5!");
		}

	}
	
}
