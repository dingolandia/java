public class Main {

	public static void main(String[] args) {

		int prevValue = 0;
		int fibonacci = 1;
		StringBuilder seqFibonacci = new StringBuilder("1");

		while (fibonacci < 100) {
			int nextValue = prevValue + fibonacci;
			prevValue = fibonacci;
			fibonacci = nextValue;

			if (fibonacci < 100) {
				seqFibonacci.append(" - ").append(fibonacci);
			}
		}

		System.out.print(seqFibonacci);
	}
}
