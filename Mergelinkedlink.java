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
       ListNode dummy=new ListNode(0);
        ListNode temp = dummy;
       ListNode l1 = list1;
        ListNode l2 = list2;

        while(l1!=null || l2!=null){
            int data1= (l1!=null)? l1.val : Integer.MAX_VALUE; 
            int data2= (l2!=null)? l2.val : Integer.MAX_VALUE; 

            if(data1<data2){
                temp.next = new ListNode(data1);
                
                l1=l1.next;

                temp=temp.next;

            }
            else{
                temp.next = new ListNode(data2);
                l2=l2.next;
                 temp=temp.next;

            } 


        }


        return dummy.next;



        
    }
}