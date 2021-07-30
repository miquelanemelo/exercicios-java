package exerciciosJava;

/*Fa�a um programa que mostre um menu op��es, receba a op��o do usuario e os dados necessario para executar cada op��o*/
import java.util.Scanner;

public class MenuDeOpcoes {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("******Bem-Vindo(a)********");
		System.out.println(" --- Menu ---");
		System.out.println("1- Somar 2 numeros: ");
		System.out.println("2- Raiz quadrada de um numero: ");
		System.out.println("Digite sua op��o: ");
		int opcao = s.nextInt();

		if (opcao == 1) {
			System.out.println("Digite o valor do primeiro numero: ");
			int numero1 = s.nextInt();
			System.out.println("Digite o valor do segundo numero: ");
			int numero2 = s.nextInt();
			int soma = numero1 + numero2;
			System.out.println("A soma de " + numero1 + " + " + numero2 + " � igual a : " + soma);
		} else if (opcao == 2) {
			System.out.println("Digite o numero que deseja a raiz quadrada: ");
			int numero = s.nextInt();
			int raiz = (int) Math.sqrt(numero);
			System.out.println("A raiz quadrada de " + numero + " � igual a: " + raiz);
		} else {
			System.out.println("Op��o invalida");

		}
	}
}
