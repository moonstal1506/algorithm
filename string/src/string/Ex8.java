package string;

import java.util.Scanner;

//8.유효한 팰린드롬
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer= "NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		if(str.equals(new StringBuilder(str).reverse().toString())) {
			answer="YES";
		}
		System.out.println(answer);
	}

}
