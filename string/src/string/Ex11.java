
package string;

import java.util.Scanner;

//11. 문자열 압축
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next()+" ";
		int count=1;
		String answer="";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}else {
				answer+=s.charAt(i);
				if(count!=1) {
					answer+=String.valueOf(count);
				}
				count=1;
			}
		}
		System.out.println(answer);
	}

}
