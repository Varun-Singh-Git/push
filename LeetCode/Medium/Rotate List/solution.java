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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int count = 0;

        // Count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        k = k % count;

        for (int i = 0; i < k; i++) {

            temp = head;

            // Reach the second-last node
            while (temp.next.next != null) {
                temp = temp.next;
            }

            ListNode last = temp.next;

            temp.next = null;
            last.next = head;
            head = last;
        }

        return head;
    }
}