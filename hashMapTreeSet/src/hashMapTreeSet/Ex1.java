package hashMapTreeSet;

import java.util.Scanner;
import java.util.HashMap;

//1.학급회장
//학생수 투표결과 입력받아
//answer 해쉬맵 만들어
//반복해서 맵에다 키와 값계산해서 넣어
//최대값 선언
//맵의 키를 돌려 값비교 최대값변경 답은 키
public class Ex1 {
	private static char solution(int n,String s) {
		char answer= ' ';
		HashMap<Character, Integer> map=new HashMap<>();
		for(char x:s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		//System.out.println(map.containsKey('A')); true
		//System.out.println(map.size()); 키 개수:5
		//System.out.println(map.remove('C')); c의 값 리턴
		
		int max=Integer.MIN_VALUE;
		for(char key:map.keySet()) {
			if(max<map.get(key)) {
				max=map.get(key);
				answer=key;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s=kb.next();
			System.out.print(solution(n,s));
		
	}

}
