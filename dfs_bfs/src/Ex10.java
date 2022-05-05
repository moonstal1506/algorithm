import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//10. Tree 말단노드까지의 까장 짧은 경로(BFS)
public class Ex10 {
	Node root;

	public int BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int L = 0;
		while (!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				Node node = q.poll();
				if(node.lt==null && node.rt==null) {
					return L;
				}
				if(node.lt != null) {
					q.add(node.lt);
				}
				if(node.rt != null) {
					q.add(node.rt);
				}
			}
			L++;
		}

		return L;
	}

	public static void main(String args[]) {
		Ex10 tree = new Ex10();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}