package com.henzo;

class Node{
    char key;
    Node left, right;
    
    Node(char key){
        this.key=key;
    }
}

class BinarySolution{
    Node root;
    void insertKey(char key){
        root = insertInTree(root, key);
    }
    
    Node insertInTree(Node root, char key){
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if(key<root.key){
            root.left = insertInTree(root.left, key);
        }
        else if(key>root.key){
            root.right = insertInTree(root.right, key);
        }
        
        return root;   
    }
    
    void preorderTraversal(Node root){
        if(root != null){
            System.out.print(root.key+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
}

public class BST {

    public static void main(String[] args) {
        // TODO code application logic here
        BinarySolution bs = new BinarySolution();
        bs.insertKey('C');
        bs.insertKey('I');
        bs.insertKey('B');
        bs.insertKey('G');
        bs.insertKey('H');
        bs.insertKey('A');
        
        bs.preorderTraversal(bs.root);
    }
    
}
