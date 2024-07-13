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
  
    public ListNode reverseLinkedList(ListNode temp)
    {
      ListNode prev = null;
      ListNode curr = temp;
      ListNode next = null;
      
      while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        
      }
      
      temp = prev;
      return temp;
    }
  
    public ListNode getKNode(ListNode temp,int k){
      k-= 1;
      while(temp!= null && k > 0){
        k--;
        temp = temp.next;
      }
      return temp;
    }
  
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while(temp != null){
          ListNode KNode = getKNode(temp,k);

            if(KNode == null){
              if(prevLast != null) prevLast.next = temp;
              break;
            }

            ListNode nextNode = KNode.next;
            KNode.next = null;

            reverseLinkedList(temp);

            if(temp == head){
              head = KNode;
            }else{
              prevLast.next = KNode;
            }
            prevLast = temp;
          temp = nextNode;
        }

          return head;


      }

}