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
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){ // the order of the condition is important because null cant point to something next , so we have to  check the inital node first
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;//if the last node is connected then slow meets fast at least once giving us a connected node in a circular linked list.
        }
        return false;
    }
}