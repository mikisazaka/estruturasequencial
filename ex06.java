package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double triangulo = a * c / 2;
		System.out.printf("Triângulo: %.3f %n", triangulo);
		
		double circulo = 3.14159 * Math.pow(c, 2);
		System.out.printf("Círculo: %.3f %n", circulo);
		
		double trapezio = (a + b) / 2 * c;
		System.out.printf("Trapézio: %.3f %n", trapezio);
		
		double quadrado = Math.pow(b, 2);
		System.out.printf("Quadrado: %.3f %n", quadrado);
		
		double retangulo = a * b;
		System.out.printf("Retângulo: %.3f %n", retangulo);
		
		sc.close();

	}

}
