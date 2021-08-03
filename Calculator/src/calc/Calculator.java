package calc;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Calculator (put spaces between the numbers and symbol \n"
				+ "ex: 1 + 1)");
		System.out.println("Enter expression below:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int result = 0;
		boolean isFirst = true;
		int sign = -1;
		int num1 = -1;
		int num2 = -1;
		while (!input.equals("end")) {
			//System.out.println(input.indexOf(" "));
			if (isFirst) {
				int space1 = -1;
				int space2 = -1;
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i) == ' ') {
						space1 = i;
						space2 = i + 2; break;
					}
				}

				 // 0 for add, 1 for subtract, 2 for multiply, 3 for divide
				// for (int i = 0; i < input.length(); i++) {
					// if (i == 0) {
				// System.out.println("-> (" + input.substring(0, space1 - 2) + ")");
				//System.out.println("space1 = " + space1);
				//System.out.println("space2 = " + space2);
				num1 = Integer.parseInt(input.substring(0, space1));
				//System.out.println(num1);
				// boolean spaceFinder = false;
				// use index of +, -, *, /; -1 to position space1
				
				// OR
				
				// have boolean (set to false); if you find white space and false, space1, else 
				
				//System.out.println(input);
				//System.out.println(input.indexOf('+'));
				//System.out.println(input.indexOf('-'));
				//System.out.println(input.indexOf('/'));
				//System.out.println(input.indexOf('*'));	
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
					result = (num1 + num2);
					System.out.println("RESULT: " + (result));
					isFirst = false;
				}
				if (sign == 1) {
					result = (num1 - num2);
					System.out.println("RESULT: " + (result));
					isFirst = false;
				}
				if (sign == 2) {
					result = (num1 * num2);
					System.out.println("RESULT: " + (result));
					isFirst = false;
				}
				if (sign == 3 && num2 == 0) {
					System.out.println("RESULT: undefined");
					input = sc.nextLine();
					continue;
				}
				if (sign == 3) {
					result = (num1 / num2);
					System.out.println("RESULT: " + (result));
					isFirst = false;
				}
				System.out.println("---------------------");
				System.out.print(result + " ");
			}
			else {
				// System.out.print(result + " ");
				// 2 onwards time 
				// symbol + _____ + #
				if (input.charAt(0) == '+') {
					sign = 0;
				}
				if (input.charAt(0) == '-') {
					sign = 1;
				}
				if (input.charAt(0) == '*') {
					sign = 2;
				}
				if (input.charAt(0) == '/') {
					sign = 3;
				}
				num2 = Integer.parseInt(input.substring(2, input.length()));
				num1 = result;
				
				if (sign == 0) {
					result = (num1 + num2);
					System.out.println("RESULT: " + (result));
					
				}
				if (sign == 1) {
					result = (num1 - num2);
					System.out.println("RESULT: " + (result));
					
				}
				if (sign == 2) {
					result = (num1 * num2);
					System.out.println("RESULT: " + (result));
					
				}
				if (sign == 3 && num2 == 0) {
					System.out.println("RESULT: undefined");
					input = sc.nextLine();
					continue;
				}
				if (sign == 3) {
					result = (num1 / num2);
					System.out.println("RESULT: " + (result));
					
				}
				System.out.println("---------------------");
				System.out.print(result + " ");
			}
			// border
			input = sc.nextLine();
		}
	}
}
