package string;

import java.util.Scanner;

//12.암호
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s= sc.next();
		String answer="";
		for(int i=0;i<n;i++) {
			String a=s.substring(0, 7).replace("#", "1").replace("*","0");
			answer+=(char)Integer.parseInt(a,2);
			s=s.substring(7); 
		}
		System.out.println(answer);
	}
}
