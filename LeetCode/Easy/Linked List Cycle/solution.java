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

        //start the two pointer like tortoise and rabit
        ListNode tortoise = head;
        ListNode rabit = head;

        while(tortoise != null && rabit != null && rabit.next != null)
        {
            // tortoise move one step and rabit move two steps
            tortoise = tortoise.next;
            rabit = rabit.next.next;

            if(tortoise == rabit)
            {
                return true;
            }
        }
        return false;
    }
}