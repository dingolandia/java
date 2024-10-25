import java.util.Scanner;

public class Main {

    // Método para limpar a tela
    public static void clearConsole() {
        // Sequência de escape ANSI para limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Capturando o nome
        clearConsole();
        System.out.print("Informe o seu nome: ");
        String nameInput = sc.nextLine();

        // Capturando a idade
        clearConsole();
        System.out.print("Informe a sua idade: ");
        int ageInput = sc.nextInt();

        // Capturando o sexo
        clearConsole();
        System.out.print("Informe o seu sexo com apenas 1 letra (M/F): ");
        char genderInput = sc.next().charAt(0);

        clearConsole();

        // Exibindo a frase final
        System.out.printf("Seu nome é %s, sua idade é %d anos, e o seu sexo é %c.%n", nameInput, ageInput, genderInput);

        sc.close();
    }
}
