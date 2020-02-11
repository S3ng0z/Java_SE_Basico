package main;

import librerias.Entrada;

public class Main {

	/*
	 * Pedir dos números y decir si son iguales o no.
	 */
	
	public static void main(String[] args) {
		int n1, n2;
		System.out.println("Introduce un número: ");
		n1 = Entrada.entero();
		System.out.println("Introduce otro número: ");
		n2 = Entrada.entero();
		
		if(n1 == n2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}

}
