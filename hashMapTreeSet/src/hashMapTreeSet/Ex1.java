package hashMapTreeSet;

import java.util.Scanner;
import java.util.HashMap;

//1.학급 회장(해쉬)
public class Ex1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s=kb.next();
		
		HashMap<Character, Integer> map=new HashMap<>();
		int max=0;
		char answer=' ';
		
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char key:map.keySet()) {
			if(max<map.get(key)) {
				max=map.get(key);
				answer = key;
			}
			
		}
		System.out.println(answer);
		
	}

}
