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
/*
Given LL is 1 , 2 , 3 ...... n-1
To be Reordered --> 0 , n , 1,n-1 , 2 , n-3 
                    0 , 1, 6 , 2 , 5, 3 , 4 ---> null.
LinkedList Two Pointers Recursion Stack
*/
class Solution {
    public void reorderList(ListNode head) {
         if (head == null) return;
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null,curr = slow,tmp;
        while(curr != null){
            tmp = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
         ListNode first = head, second = prev;
    while (second.next != null) {
      tmp = first.next;
      first.next = second;
      first = tmp;

      tmp = second.next;
      second.next = first;
      second = tmp;
    }
    }
}