package main;

import librerias.Entrada;

public class Main {

	
	/*
	 * Pedir el radio de una circunferencia y calcular su longitud.
	 */
	
	public static void main(String[] args) {
		double r, l; //radio y longitud
		
		System.out.println("Introduzca el radio de la circunferencia");
		r = Entrada.real();
		
		l = 2 * Math.PI * r;
		
		System.out.println("La longitud de una circunferencia de radio "+r+" es: "+l);
	}

}
