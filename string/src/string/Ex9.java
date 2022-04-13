package string;

import java.util.*;

//9.숫자만 추출
class Ex9 {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int answer=0;
		for(char c: str.toCharArray()) {
			if('0'<=c&&c<='9') {
				answer=answer*10+(c-'0');
			}
		}
		System.out.println(answer);
	}
}