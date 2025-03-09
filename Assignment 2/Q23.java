import java.util.Scanner;
class Q23 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		String result = (num & 1) == 0 ? "Even" : "Odd";
		System.out.println("The number is " + result);
	}
}