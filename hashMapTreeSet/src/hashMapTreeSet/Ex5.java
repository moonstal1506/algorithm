package hashMapTreeSet;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;

//트리셋: 중복제거 정렬
//5. k번째 큰 수
//n,k,배열 입력받아
//answer-1초기화
//트리셋만들어 내림차순정렬
//3중for 트리셋에 더해서넣어
//등수필요cnt
//정렬된 트리셋에서 꺼내 cnt++ k랑 같아지면 리턴
//아니면 -1을 리턴
public class Ex5 {
	private static int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());//내림차순
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int l=j+1;l<n;l++) {
					set.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
	
//		System.out.println(set.size());
//		System.out.println(set.first());
//		System.out.println(set.last());
		
		int cnt=0;
		
		for(int x:set) {
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}

		System.out.print(solution(n,k,arr));

	}

}
