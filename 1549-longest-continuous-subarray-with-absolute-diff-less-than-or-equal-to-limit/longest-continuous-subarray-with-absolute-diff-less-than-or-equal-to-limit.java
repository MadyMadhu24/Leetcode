import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int l = 0, ans = 0;

        for (int r = 0; r < nums.length; r++) {

            // Maintain decreasing order for maxDeque
            while (!maxDeque.isEmpty() && nums[r] > maxDeque.peekLast()) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(nums[r]);

            // Maintain increasing order for minDeque
            while (!minDeque.isEmpty() && nums[r] < minDeque.peekLast()) {
                minDeque.pollLast();
            }
            minDeque.addLast(nums[r]);

            // Shrink window if condition violated
            while (maxDeque.peekFirst() - minDeque.peekFirst() > limit) {
                if (nums[l] == maxDeque.peekFirst()) maxDeque.pollFirst();
                if (nums[l] == minDeque.peekFirst()) minDeque.pollFirst();
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}