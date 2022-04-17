import java.util.Scanner;


//8. 등수구하기 o
public class Ex8 {

 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		int[] num= new int[n];
		for(int i=0;i<n;i++) {
			int cnt=1;
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					cnt++;
				}
			}
			num[i]=cnt;
		}
		
		for(int i:num) {
			System.out.print(i+" ");
		}
	}

}
