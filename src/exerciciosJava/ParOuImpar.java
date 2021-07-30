package exerciciosJava;

import java.util.Scanner;
/*Crie um programa que receba um numero e diga se ele é par ou impar*/

public class ParOuImpar {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero1 = s.nextInt();
		
		int resto = (numero1 % 2);
		if(resto == 0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");
		}
	}

}
