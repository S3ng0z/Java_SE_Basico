package main;

import librerias.Entrada;

public class Main {
	
	/*
	 * Pedir tres números y mostrarlos ordenados de mayor a menor.
	 */

	public static void main(String[] args) {
		int num1, num2, num3;
		
		System.out.println("Introduzca número: ");
		num1 = Entrada.entero();
		System.out.println("Introduzca número: ");
		num2 = Entrada.entero();
		System.out.println("Introduzca número: ");
		num3 = Entrada.entero();
		
		if(num1>num2 && num2>num3) {
			System.out.println(""+num1+" "+num2+" "+num3);
		}else {
			if(num1>num3 && num3>num2) {
				System.out.println(""+num1+" "+num3+" "+num2);
			}else {
				if(num2>num1 && num1>num3) {
					System.out.println(""+num2+" "+num1+" "+num3);
				}else {
					if(num3>num1 && num1>num2) {
						System.out.println(""+num3+" "+num1+" "+num2);
					}else {
						if(num2>num3 && num3>num1) {
							System.out.println(""+num2+" "+num3+" "+num1);
						}else {
							if(num3>num2 && num2>num1) {
								System.out.println(""+num3+" "+num2+" "+num1);
							}
						}
					}
				}
			}
		}
		
	}

}
