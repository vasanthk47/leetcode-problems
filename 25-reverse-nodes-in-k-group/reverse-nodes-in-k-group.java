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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }

        // Check if there are at least k nodes left to reverse
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        
        // If there are fewer than k nodes left, don't reverse
        if (count < k) {
            return head;
        }

        // Reverse the first k nodes
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt;
        
        count = 0;
        while (count < k && curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            count++;
        }

        // Recursively reverse the next group of k nodes
        if (curr != null) {
            head.next = reverseKGroup(curr, k);
        }

        // prev is the new head of the reversed k nodes
        return prev;
    }
}