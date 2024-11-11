package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> fruits = new ArrayList<String>(Arrays.asList("Banana", "Laranja"));

		fruits.add("Morango");
		fruits.add("Abacaxi");
		fruits.add("Pêssego");
		fruits.add(1, "Limão");
		fruits.add(2, "Mamão");
		fruits.add(1, "Cereja");

		showLog(fruits);

		fruits.remove("Banana");

		showLog(fruits);

		fruits.remove(fruits.size() - 1);

		showLog(fruits);

		fruits.sort(null);

		showLog(fruits);

		fruits.sort(Comparator.reverseOrder());

		showLog(fruits);

		System.out.println("Remoção com predicados, remover tudo que inicia com a letra M");

		fruits.removeIf(x -> x.charAt(0) == 'M');

		showLog(fruits);

		System.out.println("Unindo 2 listas");

		List<String> nuts = Arrays.asList("Coco", "Amendoim", "Noz", "Castanha");

		fruits.addAll(nuts);

		showLog(fruits);

		System.out.println(
				"Procurar na lista um item específico e retornar o índice de Amendoim " + fruits.indexOf("Amendoim"));

		showLog(fruits.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()));

		String result = fruits.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println("Exibir o primeiro resultado com a letra C: " + result);

		sc.close();

	}

	private static void showLog(List<String> data) {
		System.out.println("Lista com nome das " + data.size() + " frutas: " + data);
	}
}
