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
       ListNode l1 = list1;
       ListNode l2 = list2;
       ListNode dummyNode = new ListNode(-1);
       ListNode temp = dummyNode;

      while(l1 != null && l2 !=null){
        if(l1.val < l2.val){
          temp.next = l1;
          temp = l1;
          l1 = l1.next;
        }else{
          temp.next = l2;
          temp = l2;
          l2 = l2.next;
        }
      }
      
      if(l1!=null) temp.next = l1;
      if(l2!=null) temp.next = l2;
      return dummyNode.next;
    }
}