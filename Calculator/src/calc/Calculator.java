package calc;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Calculator (put spaces between the numbers and symbol \n"
				+ "ex: 1 + 1)");
		System.out.println("Enter expression below:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("---------------------");
		//System.out.println(input.indexOf(" "));
		int space1 = -1;
		int space2 = -1;
		// boolean spaceFinder = false;
		// use index of +, -, *, /; -1 to position space1
		
		// OR
		
		// have boolean (set to false); if you find white space and false, space1, else 
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				space1 = i;
				space2 = i + 2; break;
			}
		}
		//System.out.println(input);
		//System.out.println(input.indexOf('+'));
		//System.out.println(input.indexOf('-'));
		//System.out.println(input.indexOf('/'));
		//System.out.println(input.indexOf('*'));
		
		int num1 = -1;
		int num2 = -1;
		int sign = -1; // 0 for add, 1 for subtract, 2 for multiply, 3 for divide
		// for (int i = 0; i < input.length(); i++) {
			// if (i == 0) {
		// System.out.println("-> (" + input.substring(0, space1 - 2) + ")");
		//System.out.println("space1 = " + space1);
		//System.out.println("space2 = " + space2);
		num1 = Integer.parseInt(input.substring(0, space1));
		//System.out.println(num1);
		
		
				
			// }
			// if (i == 4) {
		//System.out.println("space2" + space2);
		//System.out.println("-> (" + input.substring(space2 + 1, input.length()) + ")");
		num2 = Integer.parseInt(input.substring(space2 + 1, input.length()));
			// }
			// if (i == space2 - 1) {
				// sign = input.charAt(space2 - 1);
		if (input.charAt(space2 - 1) == '+') {
			sign = 0;
		}
		if (input.charAt(space2 - 1) == '-') {
			sign = 1;
		}
		if (input.charAt(space2 - 1) == '*') {
			sign = 2;
		}
		if (input.charAt(space2 - 1) == '/') {
			sign = 3;
		}
			// }
		// }
		if (sign == 0) {
			System.out.println("RESULT: " + (num1 + num2));
		}
		if (sign == 1) {
			System.out.println("RESULT: " + (num1 - num2));
		}
		if (sign == 2) {
			System.out.println("RESULT: " + (num1 * num2));
		}
		if (sign == 3 && num2 == 0) {
			System.out.println("RESULT: undefined");
			return;
		}
		if (sign == 3) {
			System.out.println("RESULT: " + (num1 / num2));
		}
		
	}
}
