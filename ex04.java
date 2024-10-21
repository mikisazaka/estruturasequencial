package estruturasequencial;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		numero = sc.nextInt();
		horas = sc.nextInt();
		
		double valor, salario;
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("Número: " + numero);
		System.out.printf("Salário: R$ %.2f", salario);
		
		sc.close();

	}

}
