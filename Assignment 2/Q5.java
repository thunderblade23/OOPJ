class Q5 {
	public static void main (String args []) {
		int a = 13;
		int b = 29;
		System.out.println("Before swapping a = " + a + " & b = " + b + ".");
		
		a += b; // a = a + b
		b = a - b; // b = b - a
		a -= b; // a = a - b
		System.out.println("After swapping a = " + a + " & b = " + b + ".");
	}
}