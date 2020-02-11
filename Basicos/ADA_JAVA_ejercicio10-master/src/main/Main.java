package main;

import librerias.Entrada;

public class Main {
	
	/*
	 * Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
	 */

	public static void main(String[] args) {
		int num;
		int dm, um, c, d, u;
		
		System.out.println("Introduzca un número entre 0 y 9.999");
		num = Entrada.entero();
		
		u = num %10;
		num = num/10;
		
		d = num%10;
		num = num/10;
		
		c = num%10;
		num = num/10;
		
		um = num%10;
		num = num/10;
		
		dm = num;
		
		//lo imprimimos al revés
		System.out.println(u+""+d+""+c+""+um+""+dm);
		
		//Otra forma de hacerlo
		num = 10000*u+1000*d+100*c+10*um+dm;
		System.out.println(num);
	}

}
