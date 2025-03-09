class Q10 {
	public static void main (String args[]) {
		char ch = 'c';
		
		String s = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? " is a vowel." : "is a consonent.";
		System.out.println("The character " + ch + " " + s);
	}
}