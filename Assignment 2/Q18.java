import java.util.Scanner;
class Q18 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the percentage");
		float percentage = sc.nextFloat();
		
		String s = (percentage > 40) ? "Pass" : "Fail";
		System.out.print(s);
	}
}