package main;

import librerias.Entrada;

public class Main {
	
	/*
	 * Pedir dos números y decir cual es el mayor.
	 */

	public static void main(String[] args) {
		int num1, num2;
		
		System.out.println("Introduzca un número: ");
		num1 = Entrada.entero();
		System.out.println("Introduzca otro número: ");
		num2 = Entrada.entero();
		
		if(num1>num2) {
			System.out.println(""+num1+" es mayor que "+num2);
		}else if(num2>num1) {
			System.out.println(""+num2+" es mayor que "+num1);
		}else {
			System.out.println("Son iguales");
		}
	}

}
