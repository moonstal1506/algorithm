package string;

import java.util.Scanner;
//10. 가장 짧은 문자거리
public class Ex10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		int p=1000;
		int[] arr=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				p=0;
				arr[i]=p;
			}else {
				p++;
				arr[i]=p;
			}
		}
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==c) {
				p=0;
			}else {
				p++;
				arr[i]=Integer.min(arr[i], p);
			}
		}
		for(int a: arr)
		System.out.print(a+" ");
	}

}
