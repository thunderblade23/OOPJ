import java.util.Scanner;
class Q9 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("The number " + num + (num >= 20 && num <= 50 ? " is within the range." : " is out of range."));
	}
}