package main;

import java.util.Scanner;
 
//�Է¹ް�
//�Ҽ� Ȯ�ι迭 ����
//�Ҽ� ���ϱ�
//�⺻ false
//0,1, �Ҽ��ƴѰ͵� true��
//����ϱ�
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