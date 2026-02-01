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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle using fast & slow pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare first half and reversed second half
        ListNode firstHalf = head;
        ListNode copySecondHalf = secondHalf; // keep reference to restore later if needed
        boolean result = true;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // (Optional) Step 4: Restore list if needed
        // reverseList(copySecondHalf);

        return result;
    }

    // Helper to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}