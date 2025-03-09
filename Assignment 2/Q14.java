import java.util.Scanner;
class Q14 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int count = 0;
		while(num > 0) {
			num = num & (num - 1);
			count++;
		}
		System.out.println("Number of 1s is " + count);
	}
}