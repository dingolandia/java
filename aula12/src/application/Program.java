package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		int n = 0;
		
		System.out.println("Defina o tamanho do vetor");
		n = sc.nextInt();
		
		Product[] vet = new Product[n];
		
		System.out.println("Preencha cada item no seguinte formato nome/valor");
		for (var i = 0 ; i < vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double value = sc.nextDouble();
			vet[i] = new Product(name, value);
		}
		
		System.out.println("Os valores preenchidos foram: " + Arrays.toString(vet));
		
		sc.close();
	}

}
