
import java.util.Arrays;

public class DisjointSet {

	static int N = 4;
	static int[] parents = new int[N];

	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			parents[i] = i;
		}

		union(2, 3);
		System.out.println(Arrays.toString(parents));
	}

	private static void union(int i, int j) {
		parents[find(i)] = find(j);

	}

	private static int find(int j) {
		if (parents[j] == j) {
			return j;
		}
		return parents[j] = find(parents[j]);
	}

}
