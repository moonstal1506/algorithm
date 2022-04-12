package string;

import java.util.Scanner;
//4. 단어 뒤집기
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0 ; i<n; i++) {
//			String a=new StringBuilder(sc.next()).reverse().toString();
//			System.out.println(a);
			String a = sc.next();
			char[] ch=a.toCharArray();
			int lt=0,rt=ch.length-1;
			while(lt<rt) {
				char tmp =ch[lt];
				ch[lt]=ch[rt];
				ch[rt]=tmp;
				lt++;
				rt--;
			}
			System.out.println(ch);
		}
	}
}
