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
    public void reorderList(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next != null 
               && curr.next.next != null) {

            ListNode temp = curr;

            // Find the second-last node
            while (temp.next.next != null) {
                temp = temp.next;
            }

            ListNode last = temp.next;

            // Disconnect the last node
            temp.next = null;

            // Insert last node after current node
            last.next = curr.next;
            curr.next = last;

            // Move to the next position
            curr = last.next;
        }
    }
}