package hashMapTreeSet;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

//3.매출액의 종류
//총날짜 연속날짜 입력
//매출액 배열입력받아
//답은 어레이리스트
//해쉬맵 만들어
//연속날짜-1개 맵 키값미리세팅
//rt증가시키면서 넣고 사이즈구해서 답에 넣어줌
//lt는 빼줄거임
//값이 0되면 키에서 삭제
//lt++
public class Ex3 {
	private static ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer=new ArrayList<>();
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i=0;i<k-1;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=k-1;rt<n;rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			lt++;
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x:solution(n,k,arr))
		System.out.print(x+" ");
		
	}

}
