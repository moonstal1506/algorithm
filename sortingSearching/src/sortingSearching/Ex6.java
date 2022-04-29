package sortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//6. 장난꾸러기
public class Ex6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		int[] tmp=arr.clone();
		Arrays.sort(tmp);
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(tmp[i]!=arr[i]) {
				list.add(i+1);
			}
		}
		
		for(int x:list)
		System.out.print(x+" ");
	}

}