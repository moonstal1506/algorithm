import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//10.말단노드까지의 가장 짧은 경로 BFS
public class Ex10 {
	 Node root; 
		public int BFS(Node root){ 
			Queue<Node> Q=new LinkedList<>();
			Q.offer(root);
			int L=0;
			while(!Q.isEmpty()){
				int len=Q.size();
				for(int i=0; i<len; i++){//큐안에 개수만큼 돌려
					Node cur=Q.poll();//자식노드 있는지 확인
					if(cur.lt==null && cur.rt==null) return L;//말단 노드면 리턴
					if(cur.lt!=null) Q.offer(cur.lt);//있으면 뒤에 넣어줌
					if(cur.rt!=null) Q.offer(cur.rt);
				}
				L++;
			}
			return 0;//암거나
	    } 
	  
	    public static void main(String args[]) { 
	    	Ex10 tree=new Ex10(); 
	        tree.root=new Node(1); 
	        tree.root.lt=new Node(2); 
	        tree.root.rt=new Node(3); 
	        tree.root.lt.lt=new Node(4); 
	        tree.root.lt.rt=new Node(5); 
	        System.out.println(tree.BFS(tree.root)); 
	    } 
	} 