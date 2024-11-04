package util;

public class CurrencyConverter {
	static double dollarPrice = 3.10;
	static double iofTaxPercent = 6.00;

	public static double calculateAmountDollar(double amount) {
		return dollarPrice * amount;
	}

	public static double calculateIOF(double convertedValue) {
		return convertedValue * (iofTaxPercent / 100);
	}

	public static double finalConversionUStoBRL(double amount) {
		double total = calculateAmountDollar(amount);
		return total + calculateIOF(total);
	}
}
