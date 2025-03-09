class Q1{
	public static void main (String [] args){
		int a = 10, b = 5;
		
		System.out.println("Before swapping: a = " + a + " & b = " + b);
		
		a = a^b; // 1010 ^ 0101 = 1111
		b = a^b; // 1111 ^ 0101 = 1010
		a = a^b; // 1111 ^ 1010 = 0101
		
		System.out.println("After swapping: a = " + a + " & b = " + b);
	}
}