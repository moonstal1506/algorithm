package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//4. 후위식 연산(postfix)
public class Ex4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		Stack<Integer> stack = new Stack<>();
		int result = 0;
		for (char ch : str.toCharArray()) {

			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (ch == '/') {
					stack.push(lt / rt);
				} else if (ch == '*') {
					stack.push(lt * rt);
				} else if (ch == '+') {
					stack.push(lt + rt);
				} else if (ch == '-') {
					stack.push(lt - rt);
				}
			}
		}
		System.out.println(stack.pop());
	}
}
