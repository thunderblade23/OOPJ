import java.util.Scanner;
class Q12 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int result = n << 3;
		System.out.println("Result: " + result);
	}
}