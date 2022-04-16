import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//6. 뒤집은 소수
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			int num=0;
			while(arr[i]>0) {
				num=num*10+arr[i]%10;
				arr[i]=arr[i]/10;
			}
			if(isPrime(num)) {
				System.out.print(num+" ");
			}
		}
		
		
	}

	private static boolean isPrime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
