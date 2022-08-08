package com.melodia;

class Node{
    char key;
    Node left, right;
    
    Node(char key){
        this.key=key;
    }
}
class TreeTraversal{
    Node root;
    void preorderTraversal(Node n){
        if(n!=null){
            System.out.print(n.key+" ");
            preorderTraversal(n.left);
            preorderTraversal(n.right);
        }
    }
    void postorderTraversal(Node n){
        if(n!=null){            
            postorderTraversal(n.left);
            postorderTraversal(n.right);
            System.out.print(n.key+" ");
        }
    }
     void inorderTraversal(Node n){
        if(n!=null){            
            inorderTraversal(n.left);
            System.out.print(n.key+" ");
            inorderTraversal(n.right);
        }
    }
}

public class Traversal {

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        
        tree.preorderTraversal(tree.root);
        System.out.println("");
        tree.inorderTraversal(tree.root);
        System.out.println("");
        tree.postorderTraversal(tree.root);
    }
    
}