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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode newList = head;
        while(newList != null && newList.next != null){
            if(newList.val == newList.next.val)
                newList.next = newList.next.next;
            else
                newList = newList.next;
        }
        return head;
    }
}