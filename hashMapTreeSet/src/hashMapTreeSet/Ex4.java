package hashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//4. 모든 아나그램 찾기
public class Ex4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		HashMap<Character, Integer> map =new HashMap<>();
		HashMap<Character, Integer> map2 =new HashMap<>();
		int answer=0;
		int lt=0;
		for(char key: b.toCharArray()) {
			map2.put(key, map2.getOrDefault(key, 0)+1);
		}
		for(int i =0;i<b.length()-1;i++) {
			map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
		}
		for(int rt=b.length()-1;rt<a.length();rt++) {
			map.put(a.charAt(rt), map.getOrDefault(a.charAt(rt), 0)+1);
			if(map.equals(map2)) {
				answer++;
			}
			map.put(a.charAt(lt), map.get(a.charAt(lt))-1);
			if(map.get(a.charAt(lt))==0) {
				map.remove(a.charAt(lt));
			}
			lt++;
		}
		System.out.println(answer);
	}
}
