
import java.util.Scanner;

//4. 피보나치 수열 o
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}