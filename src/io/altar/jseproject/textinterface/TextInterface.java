package io.altar.jseproject.textinterface;

import io.altar.jseproject.textinterface.ScannerUtils.ScannerUtils;

public class TextInterface {
	ScannerUtils sc = new ScannerUtils();
	
	public void ecraInicio() {
		int option = 0;
		do {
			System.out.println("1)\t Listar Produtos");
			System.out.println("2)\t Listar Proateleiras");
			System.out.println("3)\t Sair");
			int[] options = { 1, 2, 3 };
			option = sc.getValidInt("Selecionar opçao : ", options);
			switch (option) {
			case 1:
				ecraLProducts();
				break;
			case 2:
				ecraLShelves();
				break;
			case 3:
				System.out.println("Saida");
				break;
				
			}
		} while (option !=3);
	}

	private void ecraLProducts() {
		// TODO Auto-generated method stub
		int option = 0;
		do {
			System.out.println("1)\t Criar Products");
			System.out.println("2)\t Editar Products");
			System.out.println("3)\t Consultar Products");
			System.out.println("4)\t Remover Products");
			System.out.println("5)\t Voltar");
			int[] options = { 1, 2, 3 };
			option = sc.getValidInt("Selecionar opçao : ", options);
			switch (option) {
			case 1:
				System.out.println("TODO- New Logic");
				break;
			case 2:
				System.out.println("TODO- Edic Logic");
				break;
			case 3:
				System.out.println("TODO- Consult Logic");
				break;
			case 4:
				System.out.println("TODO- Remove Logic");
				break;
			case 5:
				
				break;	
			}
		} while (option !=5);
	}

	private void ecraLShelves() {
		// TODO Auto-generated method stub
		int option = 0;
		do {
			System.out.println("1)\t Criar Shelves");
			System.out.println("2)\t Editar Shelves");
			System.out.println("3)\t Consultar Shelves");
			System.out.println("4)\t Remover Shelves");
			System.out.println("5)\t Voltar");
			int[] options = { 1, 2, 3 };
			option = sc.getValidInt("Selecionar opçao : ", options);
			switch (option) {
			case 1:
				System.out.println("TODO- New Logic");
				break;
			case 2:
				System.out.println("TODO- Edic Logic");
				break;
			case 3:
				System.out.println("TODO- Consult Logic");
				break;
			case 4:
				System.out.println("TODO- Remove Logic");
				break;
			case 5:
				
				break;				
			}
		} while (option !=5);
	}
	

}
