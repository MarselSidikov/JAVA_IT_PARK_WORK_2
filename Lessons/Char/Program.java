import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		char c = 'A';
		// char -> int
		int codeOfC = c;
		System.out.println(codeOfC);
		int codeOfB = c + 1;
		char c1 = (char)codeOfB;
		System.out.println(c1);
		
		char digit = '9';
		int digitAsInt = '9' - '0'; // 9
		digitAsInt = 5;
		digit = (char)(5 + '0'); 
		
		Scanner scanner = 
			new Scanner(System.in);
		
		char character = Scanner.nextChar();
		
		if (character <= 'Z' && character >= 'A' 
			|| character <= 'z' && character >= 'a') {
				System.out.println("Is Letter");
		}
	}
}