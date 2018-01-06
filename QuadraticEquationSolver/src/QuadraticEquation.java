
/*
 * @author Bikrant Das Sharma
 * This class solves all the roots of a quadratic equation, including imaginary roots
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Please enter the coefficient of the term that is squared"
					+ "(include negative if the coefficient is negative) or Q to quit:");

			double first = in.nextDouble();
			System.out.println("Now enter the coefficient of the term that is to the power of one");
			double second = in.nextDouble();
			System.out.println("Now enter the constant");
			double third = in.nextDouble();
			solve(first, second, third);

		} catch (InputMismatchException e) {
			System.out.println("You did not enter a number. Restart the program.");
		}
	}

	private static void solve(double a, double b, double c) {
		if ((Math.pow(b, 2) - (4 * a * c)) > 0) {
			System.out.print(twoSol1(a, b, c) + " and ");
			System.out.println(twoSol2(a, b, c) + " are the two solutions");
		} else if ((Math.pow(b, 2) - (4 * a * c)) == 0) {
			System.out.println(oneSol(a, b, c) + " is the solution");
		} else {
			iSol(a, b, c);
		}
	}

	private static void iSol(double a, double b, double c) {
		double real;
		double imaginary;
		real = b / (2 * a);
		imaginary = Math.sqrt(-(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		System.out.println(real + "+" + imaginary + "i and " + real + "-" + imaginary + "i");
	}

	private static double oneSol(double a, double b, double c) {
		double sol = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		return sol;
	}

	private static double twoSol1(double a, double b, double c) {
		double sol = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		return sol;
	}

	private static double twoSol2(double a, double b, double c) {
		double sol = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		return sol;
	}
}
