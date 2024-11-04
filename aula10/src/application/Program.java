package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int accNumber = 0;
		String accName;
		double accBalance = 0;
		char initialDeposit;

		System.out.println("Informe o número da conta:");
		accNumber = sc.nextInt();
		sc.nextLine(); // Consome a quebra de linha pendente

		System.out.println("Informe o nome do usuário:");
		accName = sc.nextLine();

		System.out.println("Deseja realizar um deposito inicial?(S/N)");
		initialDeposit = sc.next().charAt(0);

		if (initialDeposit == 'S') {
			System.out.println("Qual é o valor inicial");
			accBalance = sc.nextDouble();
		}

		Account account = new Account(accNumber, accName, accBalance);

		System.out.println(account.getUserData());

		loopOperations(sc, account);

		sc.close();

	}

	private static void loopOperations(Scanner sc, Account account) {
		char operation;
		System.out.println(
				"Qual das seguintes operações deseja realizar?: [D]eposito [S]aque [A]lteração do nome [E]ncerrar");
		operation = sc.next().charAt(0);

		switch (operation) {

		case ('D'):
			account.addMoney(sc.nextDouble());
			break;
		case ('S'):
			account.withdrawal(sc.nextDouble());
			break;
		case ('A'):
			sc.nextLine();
			account.setAccountName(sc.nextLine());
			break;
		case ('E'):
			System.out.println("Agradecemos seu acesso tenha um bom dia");
			break;
		default:
			loopOperations(sc, account);
		}

		System.out.println(account.getUserData());
		if (operation != 'E')
			loopOperations(sc, account);
	}

}
