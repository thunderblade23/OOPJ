import java.util.Scanner;
class Q16 {
	public static void main (String args[]) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = num.nextInt();
		
		String s = (a > 0) ? " is positive." : (a < 0) ? " is negative." : (a == 0) ? " is zero." : " not a number.";
		System.out.println("The number " + a + s);
	}
} 