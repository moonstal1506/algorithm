import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//5. 소수(에라토스테네스 체)
public class Ex5 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n+1];
		int count=0;
		for(int i=2;i<=n;i++) {
			if(arr[i]==0) {
				count++;
			}
			for(int j=i;j<=n;j+=i) {
				arr[j]=1;
			}
		}
		System.out.println(count);
	}
}
