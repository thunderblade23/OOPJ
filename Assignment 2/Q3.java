class Q3{
	public static void main (String args []){
		int num = 1764;
		int sum = 0;
		while (num != 0){
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Sum of digits is " + sum + ".");
	}
}