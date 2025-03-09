class Q6 {
	public static void main (String args[]) {
		int a = 12, b = 45, c = 3;
		int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("Largest number of " + a + " " + b + " & " + c + " is " + largest + ".");
	}
}