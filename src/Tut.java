import java.util.Scanner;

public class Tut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("  ");
		System.out.println("Enter the first num");
		double a = scanner.nextDouble();
		System.out.println("Enter the second num ");
		double b = scanner.nextDouble();

		double hyp = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("The hypotenuse is " + hyp);
		scanner.close();
		

	}
}
