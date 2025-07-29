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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slower = head, faster = head;
        Stack<Integer> stack = new Stack<>();
        while(faster != null && faster.next != null){
            stack.push(slower.val);
            slower = slower.next;
            faster = faster.next.next;
        }

        if(faster != null)
            slower = slower.next;

        while(slower != null){
            if(slower.val != stack.pop())
                return false;
            slower = slower.next;
        }
        return true;
    }
}