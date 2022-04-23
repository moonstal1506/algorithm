package hashMapTreeSet;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

//3. 매출액의 종류
public class Ex3 {
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		HashMap<Integer, Integer> map= new HashMap<>();
		ArrayList<Integer> answer=new ArrayList<>();
		for(int i=0;i<k-1;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=k-1;rt<n;rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		for(int i: answer) {
			System.out.print(i+" ");
		}
	}
}
