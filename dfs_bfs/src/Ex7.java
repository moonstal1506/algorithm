import java.util.LinkedList;
import java.util.Queue;

//7. 이진트리 레벨탐색(BFS : Breadth-First Search)

public class Ex7 {
    Node root; 
    
    public void BFS(Node root){ 
		int L=0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			System.out.print(L+" : ");
			int len =q.size();
			for(int i = 0; i < len; i++) {
				Node node = q.poll();
				System.out.print(node.data + " ");
				if(node.lt!=null) {
					q.add(node.lt);
					
				}
				if(node.rt!=null) {
					q.add(node.rt);
				}
			}
			L++;
			System.out.println();
		}
        
    } 
  
    public static void main(String args[]) { 
    	Ex7 tree=new Ex7(); 
        tree.root=new Node(1); 
        tree.root.lt=new Node(2); 
        tree.root.rt=new Node(3); 
        tree.root.lt.lt=new Node(4); 
        tree.root.lt.rt=new Node(5); 
		tree.root.rt.lt=new Node(6); 
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root); 
    } 
} 
