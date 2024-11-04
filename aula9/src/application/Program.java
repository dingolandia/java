package application;

import java.util.Locale;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double dollarQty = 200;

		System.out.println("Valor de entrada em dolares: $" + String.format("%.2f", dollarQty) + 
				" Convertido para R$ " + String.format("%.2f", CurrencyConverter.finalConversionUStoBRL(dollarQty)));

	}

}
