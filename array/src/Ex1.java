
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1. 큰수출력하기
//정수입력받아 배열생성
//반복문으로 수 배열에 담아
//솔루션에 넘겨
//어레이리스트 만들어 0번째 answer에 담고
//비교반복 크면 담기 

public class Ex1 {
	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x: solution(n,arr)) {
			System.out.print(x+" ");
		}
	}

}