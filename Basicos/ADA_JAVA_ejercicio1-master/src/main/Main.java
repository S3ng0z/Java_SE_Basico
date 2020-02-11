package main;

import librerias.Entrada;

public class Main {
	/*
	 * Pedir los coeficientes de una ecuación de 2º grado, y muestre sus soluciones reales. Si no existen,
	 * debe indicarlo
	*/
	public static void main(String[] args) {
		double a, b, c; //coefiecintes ax^2+bx+c=0
		double x1, x2, d; //soluciones y determinante.
		
		System.out.println("Introduzca el primer coeficiente (a): ");
		a = Entrada.entero();
		System.out.println("Introduzca el primer coeficiente (b): ");
		b = Entrada.entero();
		System.out.println("Introduzca el primer coeficiente (c): ");
		c = Entrada.entero();
		
		d = (b*b)-2*a*c;
		if(d<0) {
			System.out.println("No existe soluciones reales");
		}else {
			x1 = -b+Math.sqrt(d)/(2*a);
			x2 = -b-Math.sqrt(d)/(2*a);
			System.out.println("Solución: "+x1);
			System.out.println("Solución: "+x2);
		}
			
	}

}
