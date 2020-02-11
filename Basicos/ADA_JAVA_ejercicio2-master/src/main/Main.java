package main;

import librerias.Entrada;

public class Main {

	//Pedir el radio de un círculo y calcular su área. A = PI*r^2
	
	public static void main(String[] args) {
		double a, r; //área y radio.
		System.out.println("Introduce el radio de un círculo: ");
		r = Entrada.real();
		a = Math.PI * Math.pow(r, 2);
		
		System.out.println("El área de una circunferencia de radio: "+r+ " es: "+a);
	}

}
