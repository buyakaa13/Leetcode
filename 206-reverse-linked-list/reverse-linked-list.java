/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        Stack<ListNode> stack = new Stack<>();
        while(head != null){
            stack.add(head);
            head = head.next;
        }

        ListNode newHead = stack.pop();
        ListNode list = newHead;
        while(!stack.isEmpty()){
            ListNode current = stack.pop();
            list.next = current;
            list = current;
        }
        list.next = null;
        return newHead;
    }
}