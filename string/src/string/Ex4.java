package string;

import java.util.ArrayList;
import java.util.Scanner;
//Ex4
public class Ex4 {
	private ArrayList<String> solution(int n,String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x: str) {
//		String tmp= new StringBuilder(x).reverse().toString();
//		answer.add(tmp);
			char[] s =x.toCharArray();
			int lt=0,rt=x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp= String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str= new String[n];
		for(int i =0 ; i<n; i++) {
			str[i]=kb.next();
		}
		for(String x: T.solution(n,str)) {
			System.out.println(x);
		}
	}

}
