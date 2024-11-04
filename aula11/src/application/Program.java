package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] vet = new double[3];
		int vetSize;

		System.out.println("Informe o tamanho do Vetor");
		vetSize = sc.nextInt();

		System.out.println("Preencha todos os: [" + vetSize + "] campos do vetor com valores decimais ");
		for (var i = 0; i < vetSize; i++) {
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("Os valores informados foram: " + Arrays.toString(vet));
		
		double sum = 0;
		for (var i = 0; i < vetSize; i++) {
			sum += vet[i];
		}
		
		System.out.println("A média dos valores informados é de: " + String.format("%.2f", sum / vetSize));

		sc.close();

	}

}
