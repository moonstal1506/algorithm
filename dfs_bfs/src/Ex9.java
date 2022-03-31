import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//9. 말단노드까지의 가장 짧은 경로DFS
//최단거리는 bfs로 풀어야하긴함

public class Ex9 {
	Node root; 
    public int DFS(int L, Node root){ 
        if(root.lt==null && root.rt==null) return L; //말단 노드일때 리턴
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));//레벨증가시켜 왼쪽 오른쪽 뻗어나감 작은값 리턴받음
    } 
  
    public static void main(String args[]) { 
    	Ex9 tree=new Ex9(); 
        tree.root=new Node(1); 
        tree.root.lt=new Node(2); 
        tree.root.rt=new Node(3); 
        tree.root.lt.lt=new Node(4); 
        tree.root.lt.rt=new Node(5); 
        System.out.println(tree.DFS(0, tree.root)); //레벨이랑 루트노드 넘김 최종리턴받는것 출력
    } 
} 