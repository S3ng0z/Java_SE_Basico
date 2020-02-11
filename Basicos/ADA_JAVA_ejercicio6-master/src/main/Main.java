package main;

import librerias.Entrada;

public class Main {
	
	/*
	 * Pedir dos números y decir si uno es múltiplo del otro.
	 */

	public static void main(String[] args) {
		int num1, num2;
		
		System.out.println("Introduzca número: ");
		num1 = Entrada.entero();
		System.out.println("Introduzca otro número: ");
		num2 = Entrada.entero();
		
		if(num1%num2==0) {
			System.out.println("Son múltiplos");
		}else {
			System.out.println("No son múltiplos");
		}
	}

}
