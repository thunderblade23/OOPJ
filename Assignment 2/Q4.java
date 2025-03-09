class Q4 {
	public static void main (String args[]) {
		int num = 9;
		
		boolean isDivisible = checkDivisibility(num);
		System.out.println(isDivisible ? "Yes" : "No");
	}
	public static boolean checkDivisibility(int num) {
		num = Math.abs (num);
		
		while (num > 2) {
			num -= 3;
		}
		return num == 0;
	}
}