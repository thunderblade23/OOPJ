class Q2 {
	public static void main (String [] args){
		int n = 13;
		String result = (n & 1) == 0 ? "Even" : "Odd";
		System.out.println("The number " + n + " is " + result + ".");
	}
}