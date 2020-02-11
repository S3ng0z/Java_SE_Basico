package main;

import librerias.Entrada;

public class Main {
	
	/*
	 * Pedir un número entre 0 y 99.999, decir si es capicúa.
	 */

	public static void main(String[] args) {
		
		int num;
		int u, d, c, um, dm;
		boolean capicua = false;
		
		System.out.println("Introduzca un número entre 0 y 99.999: ");
		num = Entrada.entero();
		
		u = num%10;
		num /= 10;
		
		d = num%10;
		num /= 10;
		
		c = num%10;
		num /= 10;
		
		um = num%10;
		num /= 10;
		
		dm = num;
		
		if(dm == u && um == d) {
			capicua = true;
		}else if(dm == 0 && um == u && c == d) {
			capicua = true;
		}else if(dm == 0 && um == 0 && c == u) {
			capicua = true;
		}
		
		if(capicua) {
			System.out.println("El número es capicúa");
		}else {
			System.out.println("El número no es capicúa");
		}
		
		
		
	}

}
