/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        Node last = head;
        while (last.next != null) last = last.next;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        while (head != null && last != null && head != last && head.prev != last) {
            int sum = head.data + last.data;
            if (sum == target) {
                list.add(new ArrayList<>(Arrays.asList(head.data, last.data)));
                head = head.next;
                last = last.prev;
            }else if (sum < target) {
                head = head.next;
            }else{
                last = last.prev;
            }
        }
        
        return list;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/