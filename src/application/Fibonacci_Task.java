package application;

import java.util.Scanner;

public class Fibonacci_Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		
		int numberInf = sc.nextInt();
		
		if(verificacao(numberInf))
			System.out.println("O numero " + numberInf + " Pertence a sequência de Fibonacci");
		else {
			System.out.println("O numero " + numberInf + " não pertence a sequência de Fibonacci");
		}
		sc.close();
	}

	public static boolean verificacao(Integer number) {
		int a = 0;
		int b = 1;
		while(b < number) {
			int num = b;
			b = a + b;
			a = num;
		}
		return b == number;
	}
}
 