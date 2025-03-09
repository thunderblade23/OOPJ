class Q19 {
	public static void main (String args[]) {
		char a = 'A';
		String s = Character.isUpperCase(a) ? "Is Upper Case" : Character.isLowerCase(a) ? "Is Lower Case" : "Not a letter";
		System.out.println(s);
	}
}