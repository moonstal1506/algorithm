import java.util.LinkedList;
import java.util.Queue;

//7. 이진트리 레벨탐색

public class Ex7 {
    Node root; 
    public void BFS(Node root){ 
		Queue<Node> Q=new LinkedList<>();//큐를 씀
		Q.add(root);
		int L=0; //최상단 노드 0 
        while(!Q.isEmpty()){ //비어있지 않을 때까지
            int len = Q.size();
			System.out.print(L+" : ");
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.add(cur.lt);//뒤에 넣어줌
                if(cur.rt!=null) Q.add(cur.rt);
            }
			L++;//레벨 증가 
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
