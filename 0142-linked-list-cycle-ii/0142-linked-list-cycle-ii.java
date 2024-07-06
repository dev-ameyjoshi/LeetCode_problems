/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // takes 1 step
            fast = fast.next.next; //takes 2 step at a time.
            if (slow == fast) 
            {
              slow = head;
              while (fast != slow) {
              slow = slow.next;
              fast = fast.next;
                }
              return slow;
            };
        }
         //reached the end and never came back.
       return null;
        
        
    }
}