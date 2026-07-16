/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        while (root != null) {
            Node temp = root;
            while (temp != null) {
                list.add(temp.data);
                temp = temp.bottom;
            }
            root = root.next;
        }
        Collections.sort(list);
        Node head = new Node(-1);
        Node temp = head;
        for (int z : list) {
            temp.bottom = new Node(z);
            temp = temp.bottom;
        }
        
        return head.bottom;
    }
}

/*
    Time Complexity : O(n log n)
    Space Complexity : O(n)
*/