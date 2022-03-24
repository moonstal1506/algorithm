package hashMapTreeSet;

import java.util.Scanner;
import java.util.HashMap;

//2.아나그램
//String 2개 입력받아
//답은 yes로 초기화
//해쉬맵만들어 키와 값 넣어줘
//두번째 단어돌면서 키포함? 값이0인지 확인 후
//있으면 맵의 값을 감소시킴
public class Ex2 {
	private static String solution(String a,String b) {
		String answer="YES";
		HashMap<Character, Integer> map= new HashMap<>();
		for(char key: a.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0)+1);
			
		}
		for(char key:b.toCharArray()) {
			if(!map.containsKey(key)||map.get(key)==0) {
				return "NO";
			}else {
				map.put(key, map.get(key)-1);
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.print(solution(a,b));
		
	}

}
