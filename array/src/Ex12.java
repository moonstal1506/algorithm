import java.util.Scanner;


//12.멘토링
public class Ex12 {
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		
		int answer=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {//여기까지 짝꿍 정해지고 밑에부터 두명에 대한 등수 비교
				int cnt=0;
				for(int k=0;k<m;k++) {//테스트
					int pi=0,pj=0;
					for(int s=0;s<n;s++) {//등수
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;//둘 비교한거
				}
				if(cnt==m) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
