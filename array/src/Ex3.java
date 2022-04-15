
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//3. 가위 바위 보
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[n];
		int[] b= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]-b[i]==0) {
				System.out.println("D");
			}else if(a[i]-b[i]==-2||a[i]-b[i]==1) {
				System.out.println("A");
			}else {
				System.out.println("B");
			}
		}
	}
}