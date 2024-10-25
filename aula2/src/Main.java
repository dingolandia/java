import java.text.NumberFormat;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String name = "João Carvalho";
		byte age = 55;
		double x = 10.12484;
		double salary = 8555.6777;
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
		String formattedSalary = currencyFormat.format(salary);
		System.out.println(x);
		System.out.printf("%.2f%n", x);		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("O RESULTADO É %.2f%n", x);
		
		System.out.printf("%s tem %d anos de idade %ne recebe R$ %s reais de salário", name, age, formattedSalary);
	}

}
