package lists;

import java.util.Scanner;

/* Utilizando listas, fa�a um programa que pe�a 5 perguntas para uma pessoa
 * 1. telefonou para a v�tima?
 * 2. Estevae no local do crime?
 * 3. Mora perto da v�tima?
 * 4. Devia para v�tima?
 * 5. J� trabalhou com a v�tima?
 * se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "suspeita", entre 3 e 4 como s"c�mplice" e 5 como "Assassina*. Caso contr�rio, ela ser�
 *  classificado como "inocente"
 *  */
public class ExercicioCrime {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.println("Responda SIM = 1 / N�O = 0");
		
		System.out.println("telefonou para a v�tima?");
		int num1 = read.nextInt();
		System.out.println("Esteve no local do crime?");
		int num2 = read.nextInt() + num1;
		System.out.println("Mora perto da v�tima?");
		int num3 = read.nextInt() + num2;
		System.out.println("Devia para v�tima?");
		int num4 = read.nextInt() + num3;
		System.out.println("J� trabalhou com a v�tima?");
		int num5 = read.nextInt() + num4;
		
		
		switch (num5) {
		case 1:
			System.out.println("vc � inocente");
			break;
		case 2:
			System.out.println("vc � suspeita");
			break;
		case 3:
			System.out.println("vc � c�mplice");
			break;
		case 4:
			System.out.println("vc � c�mplice");
			break;
		case 5:
			System.out.println("vc � assassina");
			break;
		default :
			System.out.println("voce � inocente");
			break;
		}
		
	}
	
	

	
}
