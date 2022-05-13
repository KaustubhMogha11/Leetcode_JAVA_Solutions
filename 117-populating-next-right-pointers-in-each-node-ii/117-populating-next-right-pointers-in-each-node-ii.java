/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
  public Node connect(Node root) {
    Node cur = root;
    while (cur != null) {
        Node head = new Node();
        Node child = head;
        while (cur != null) {
            if (cur.left != null) {
                child.next = cur.left;
                child = child.next;
            }
            if (cur.right != null) {
                child.next = cur.right;
                child = child.next;
            }
            cur = cur.next;
        }
        cur = head.next;
    }
    return root;
}
}