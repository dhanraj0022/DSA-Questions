
class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class nodes {
    public static void main(String[] args){
        Node a = new Node(10); // Root
        Node b = new Node(20); // a.left = b, a.right = c
        Node c = new Node(30);
        Node d = new Node(40); // b.left = d, b.right = e
        Node e = new Node(50);
        Node f = new Node(60); // c.left = f, c.right = g
        Node g = new Node(70);
        // connect
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        print(a);
    }
    // printing using recursion
    public static void print(Node root){
        if(root == null) return;
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
}
