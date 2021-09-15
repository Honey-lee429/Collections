package lists;

import java.util.Scanner;

/* Utilizando listas, faça um programa que peça 5 perguntas para uma pessoa
 * 1. telefonou para a vítima?
 * 2. Estevae no local do crime?
 * 3. Mora perto da vítima?
 * 4. Devia para vítima?
 * 5. Já trabalhou com a vítima?
 * se a pessoa responder positivamente a 2 questões ela deve ser classificada como "suspeita", entre 3 e 4 como s"cúmplice" e 5 como "Assassina*. Caso contrário, ela será
 *  classificado como "inocente"
 *  */
public class ExercicioCrime {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.println("Responda SIM = 1 / NÃO = 0");
		
		System.out.println("telefonou para a vítima?");
		int num1 = read.nextInt();
		System.out.println("Esteve no local do crime?");
		int num2 = read.nextInt() + num1;
		System.out.println("Mora perto da vítima?");
		int num3 = read.nextInt() + num2;
		System.out.println("Devia para vítima?");
		int num4 = read.nextInt() + num3;
		System.out.println("Já trabalhou com a vítima?");
		int num5 = read.nextInt() + num4;
		
		
		switch (num5) {
		case 1:
			System.out.println("vc é inocente");
			break;
		case 2:
			System.out.println("vc é suspeita");
			break;
		case 3:
			System.out.println("vc é cúmplice");
			break;
		case 4:
			System.out.println("vc é cúmplice");
			break;
		case 5:
			System.out.println("vc é assassina");
			break;
		default :
			System.out.println("voce é inocente");
			break;
		}
		
	}
	
	

	
}
