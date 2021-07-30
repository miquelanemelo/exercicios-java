package exerciciosJava;


import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Scanner;


/*Faça um programa que mostre a data e hora do sistema nos seguintes formatos DD/MM/AAAA - mês por extenso e hora:minuto*/

public class DataEHora {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o mês em numero ex: 1 para janeiro, 2 para fevereiro etc...");
		int mes = s.nextInt();
		switch(mes) {
		case 1 : System.out.println("janeiro"); break;
		case 2 : System.out.println("Fevereiro"); break;
		case 3 : System.out.println("Março"); break;
		case 4 : System.out.println("Abril"); break;
		case 5 : System.out.println("Maio"); break;
		case 6 : System.out.println("Junho"); break;
		case 7 : System.out.println("Julho"); break;
		case 8 : System.out.println("Agosto"); break;
		case 9 : System.out.println("Setembro"); break;
		case 10 : System.out.println("Outubro"); break;
		case 11 : System.out.println("Novembro"); break;
		case 12 : System.out.println("Dezembro"); break;
		}
		Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         String dataFormatada = formatter.format(agora);
         LocalTime agora1 = LocalTime.now();
         System.out.println(dataFormatada);
         System.out.println(agora1);
		
	}

}
