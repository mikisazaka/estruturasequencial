package estruturasequencial;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int codigo1, qtda1;
		codigo1 = sc.nextInt();
		qtda1 = sc.nextInt();
		
		double valor1;
		valor1 = sc.nextDouble();
		
		
		int codigo2, qtda2;
		codigo2 = sc.nextInt();
		qtda2 = sc.nextInt();
		
		double valor2, custo;
		valor2 = sc.nextDouble();
		
		custo = qtda1 * valor1 + qtda2 * valor2;
		System.out.println("Valor a pagar: " + custo);
		
		sc.close();

	}

}
