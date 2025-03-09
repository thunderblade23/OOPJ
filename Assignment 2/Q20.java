import java.util.Scanner;
class Q20 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number");
		int num = sc.nextInt();
		
		int absoluteVal = (num < 0) ? -num : num;
		System.out.println("The Absoute value of " + num + " is " + absoluteVal + ".");
	}
}