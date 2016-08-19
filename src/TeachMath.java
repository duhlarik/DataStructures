import java.util.Scanner;
import java.util.Stack;

public class TeachMath {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		Stack<Integer> s = new Stack<Integer>();

		int number;
		int answer = 0;
		int x;
		int y;

		System.out.println("Enter a calculation in Postfix.");

		String input = scan1.nextLine();

		for (int i = 0; i < input.length(); i++) {
			if (!((input.charAt(i)) >= '0' && (input.charAt(i) <= '9'))) {
				x = s.pop();
				y = s.pop();
				switch (input.charAt(i)) {
				case '*':
					answer = x * y;
					s.push(answer);
					break;
				case '/':
					answer = y / x;
					s.push(answer);
					break;
				case '+':
					answer = x + y;
					s.push(answer);
					break;
				case '-':
					answer = y - x;
					s.push(answer);
					break;
				}
			} else {
				number = Character.getNumericValue(input.charAt(i));
				s.push(number);
			}
		}
		System.out.println(answer);

		scan1.close();
	}
}
