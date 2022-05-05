//1650. Lowest Common Ancestor of a Binary Tree III
//1650. Lowest Common Ancestor of a Binary Tree III
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        if(p ==null || q==null) return null;
        
        Node headA = p;
        Node headB = q;
        
        while(headA!=headB){
            if(headA ==null){
                headA = q;
            }else{
                headA = headA.parent;
            }
            
            if(headB ==null){
                headB = p;
            }else{
                headB = headB.parent;
            }
        }
        
        return headB;
    }
}
