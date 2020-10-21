
//Fibonacci numbers 
import java.io.*;

public class Fibonacci {
	static int fib(int n) {
		int n1 = 1, n2 = 1, n3;
		if (n == 0)
			return n1;

		System.out.println("fibonacci series");
		for (int i = 1; i <= n; ++i) {

			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

		}
		return n2;
	}

	public static void main(String args[]) {
		int n = 20;
		System.out.println(fib(n));
	}

}
