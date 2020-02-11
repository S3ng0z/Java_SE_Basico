package main;

import librerias.Entrada;

public class Main {

	/*
	 * Pedir un número e indicar si es positivo o negativo. 
	 */
	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		if(num<0) {
			System.out.println("El número introducido es negativo");
		}else {
			System.out.println("El número introducido es positivo");
		}
	}

}
