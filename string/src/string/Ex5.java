package string;

import java.util.Scanner;
//5. 특정 문자 뒤집기
public class Ex5 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch=str.toCharArray();
		int lt=0,rt=ch.length-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(ch[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(ch[rt])) {
				rt--;
			}else {
				char tmp=ch[lt];
				ch[lt]=ch[rt];
				ch[rt]=tmp;
			}
		}
		System.out.println(ch);
		
	}

}
