package main;

import java.util.Scanner;
 
//입력받고
//소수 확인배열 생성
//소수 구하기
//기본 false
//0,1, 소수아닌것들 true로
//출력하기
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean[] prime=new boolean[m+1];
		getPrime(prime);
		
		for(int i = m; i <= n; i++) {
			if(!prime[i]) System.out.println(i);
		}
	}

	private static void getPrime(boolean[] prime) {
		prime[0]=prime[1]=true;
		
		for(int i=2;i<= Math.sqrt(prime.length);i++) {
			for(int j=i*i;j<=prime.length;j+=i) {
				prime[j] = true;
			}
		}
		
	}

}