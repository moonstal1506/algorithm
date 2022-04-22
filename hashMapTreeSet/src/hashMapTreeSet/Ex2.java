package hashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//아나그램(해쉬) 
public class Ex2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		HashMap<Character, Integer> map = new HashMap<>();
		String isEquel = "YES";
		for (char ch : a.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char key : b.toCharArray()) {
			if (!map.containsKey(key) || map.get(key) == 0) {
				isEquel = "NO";
				break;
			}
			map.put(key, map.get(key) - 1);
		}
		System.out.println(isEquel);
	}
}
