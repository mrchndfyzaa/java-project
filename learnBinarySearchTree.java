package binary_search_tree;
import java.util.*;

class Node {
    int data;
    Node nodeKiri;
    Node nodeKanan;

    public Node(int dt) {
        data = dt;
        nodeKiri = nodeKanan = null;
    }
    
    public void sisipDt(int dtSisip ){
        if (dtSisip < data){
            if(nodeKiri == null)
                nodeKiri = new Node( dtSisip );
            else
                nodeKiri.sisipDt( dtSisip );
        }
        else if(dtSisip > data){
            if ( nodeKanan == null )
                nodeKanan = new Node(dtSisip);
            else nodeKanan.sisipDt(dtSisip);
        }
    }

}

public class Binary_Search_Tree {
    private Node root;
    
    public Binary_Search_Tree() {
        root = null;
    }

    public void sisipDtNode(int dtSisip){
        if (root == null) root = new Node( dtSisip );
        else root.sisipDt(dtSisip);
    }

    public void preorderTraversal() {
        preorder(root);
    }

    public void preorder(Node data){
        //code here
        if(root == null)
            return;
  
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
  
        while(!stack.empty()){
          
            Node n = stack.pop();
            System.out.printf("%d ",n.data);
  
           
            if(n.nodeKanan != null){
                stack.push(n.nodeKanan);
            }
            if(n.nodeKiri != null){
                stack.push(n.nodeKiri);
            }
  
        }
    }

    public void inorderTraversal() {
        inorder(root);
    }

    public void inorder(Node data){
        //code here
        if(root == null) return;
 
	Stack<Node> s = new Stack<Node>();
	Node currentNode = root;
 
	while(!s.empty() || currentNode!=null){
 
            if(currentNode!=null){
		s.push(currentNode);
		currentNode=currentNode.nodeKiri;
            }
            else
            {
		Node n=s.pop();
		System.out.printf("%d ",n.data);
		currentNode=n.nodeKanan;
            }
        }
    }

    public void postorderTraversal() {
        postorder(root);
    }

    public void postorder(Node data){
        //code here
        if( root == null ) return;
 
	Stack<Node> s = new Stack<Node>( );
	Node current = root;
 
	while(true) {
            if(current != null) {
		if(current.nodeKanan != null ) 
                    s.push(current.nodeKanan);
                    s.push(current);
                    current = current.nodeKiri;
                    continue;
            }
 
            if(s.isEmpty()) 
                return;
            current = s.pop();
        
            if(current.nodeKanan != null && ! s.isEmpty() && current.nodeKanan == s.peek( )) {
		s.pop();
		s.push(current);
		current = current.nodeKanan;
		} 
            else {
                System.out.print(current.data + " ");
                current = null;
            }
	}
        
    }

    public static void main(String args[]){
        Binary_Search_Tree Tree = new Binary_Search_Tree();
        int nilai;
        Random randomNumber = new Random();
        System.out.println("sisip nilai data berikut : ");

        // sisipDt 10 bilangan acak dari 0-99 ke dalam tree
        for (int i = 1; i <= 10; i++) {
           nilai = randomNumber.nextInt(100);
           System.out.print(nilai + " ");
           Tree.sisipDtNode(nilai);
        }
        System.out.println("\n\nPreorder traversal");
        Tree.preorderTraversal();
        System.out.println("\n\nInorder traversal");
        Tree.inorderTraversal();
        System.out.println("\n\nPostorder traversal");
        Tree.postorderTraversal();
        System.out.println();
    }
}
