package application;

import java.util.Scanner;

public class InverterString {
	public static String inverterString(String str) {

		char[] caracteres = str.toCharArray();

		int inicio = 0;
		int fim = caracteres.length - 1;

		while (inicio < fim) {

			char temp = caracteres[inicio];
			caracteres[inicio] = caracteres[fim];
			caracteres[fim] = temp;

			inicio++;
			fim--;
		}

		StringBuilder strInvertida = new StringBuilder();
		for (char c : caracteres) {
			strInvertida.append(c);
		}

		return strInvertida.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma string para inverter: ");
		String stringOriginal = scanner.nextLine();
		scanner.close();

		String stringInvertida = inverterString(stringOriginal);
		System.out.println("String invertida: " + stringInvertida);
	}

}
