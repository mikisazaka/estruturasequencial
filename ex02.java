package estruturasequencial;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, area, π;
		raio = sc.nextDouble();
		
		π = 3.14159;
		area = π * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();

	}

}
