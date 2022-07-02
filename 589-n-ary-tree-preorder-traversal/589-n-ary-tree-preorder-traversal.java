/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


class Solution {
    private void traverse(List<Integer> ls,Node root) {
        if(root == null) return;
        ls.add(root.val);
        for(int i = 0;i < root.children.size();i++) {
            traverse(ls,root.children.get(i));
        }
        return;
    }
    public List<Integer> preorder(Node root) {
        List<Integer> ls = new ArrayList<>();
        traverse(ls,root);
        return ls;
    }
}