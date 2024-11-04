package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Informe o nome do produto:");
		product.name = sc.nextLine();

		System.out.println("Informe o valor do produto:");
		product.price = sc.nextDouble();

		System.out.println("Informe a quantidade de produtos:");
		product.quantity = sc.nextInt();

		logProductData(product);

		System.out.println("Adicione mais produtos:");
		product.addProducts(sc.nextInt());

		logProductData(product);

		System.out.println("Remova alguns produtos:");
		product.removeProducts(sc.nextInt());

		logProductData(product);

		sc.close();

	}

	private static void logProductData(Product product) {
		System.out.println("Product data: " + product.name + ", $ " + String.format("%.2f", product.price) + ", "
				+ product.quantity + ", total: " + String.format("%.2f", product.totalValueInStock()));
	}

}
