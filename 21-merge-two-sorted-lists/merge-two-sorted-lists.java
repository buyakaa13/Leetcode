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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //1, 2, 4
        //1, 3, 4
        //1,1,2,3,4,4
        if(list1 != null && list2 != null){
            System.out.printf("list1: %d l2: %d ", list1.val, list2.val);
            System.out.println();
            if(list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;  
            }
            else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        return list1 == null ? list2 : list1;
    }
}