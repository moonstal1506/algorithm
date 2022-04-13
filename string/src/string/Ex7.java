package string;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
