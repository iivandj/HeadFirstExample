package main;

public class FirstClass {

	public static void main(String[] args) {

		int n = 200;

		int counter = 0;

		while (counter < n) {
			// System.out.print("Hello World\n"); // Pozdrav svijete !

			if (counter % 2 == 0) {
				System.out.print(counter+ " is even number\n"); // Pozdrav svijete !
			} else {
				System.out.print(counter+ " is odd number\n"); // Pozdrav svijete !
			}

			counter = counter + 1;
		}

	}
}
