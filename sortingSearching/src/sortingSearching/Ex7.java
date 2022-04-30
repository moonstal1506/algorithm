package sortingSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//7. 좌표 정렬

class Point implements Comparable<Point>{
	int x,y;

	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public int compareTo(Point o) {
		if(o.x==x) {
			return y-o.y;
		}else {
			return x-o.x;
		}
	}
}

public class Ex7 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr= new ArrayList<>();
		for(int i=0;i<n;i++) {
			int x=kb.nextInt();
			int y=kb.nextInt();
			arr.add(new Point(x,y));
		}
		Collections.sort(arr);
		for(Point o: arr) {
			System.out.println(o.x+" "+o.y);
		}
	}
}