import java.util.*;

class Q8 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean first;
		boolean second;
		boolean third;
		boolean result;
		
		System.out.print("Enter first boolean value: ");
		first = sc.nextBoolean();
		System.out.print("Enter second boolean value: ");
		second = sc.nextBoolean();
		System.out.print("Enter third boolean value: ");
		third = sc.nextBoolean();
		
		if (first) {
			result = second || third;
		}
		else {
			result = second && third;
		}
		System.out.println();
		if (result) {
			System.out.println("The boolean variables are true.");
		}
		else {
			System.out.println("The boolean variables are false.");
		}
	}
}