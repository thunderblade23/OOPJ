import java.util.Scanner;
class Q11 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		boolean isPowerOfTwo = (n > 0) && ((n & (n-1)) == 0);
		System.	out.println(isPowerOfTwo ? "Yes" : "No");
	}
}