class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] res = new Integer[n];
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = 0;
            indexes[i] = i;
        }
        mergeSort(nums, indexes, res, 0, n - 1);
        return Arrays.asList(res);
    }

    private void mergeSort(int[] nums, int[] indexes, Integer[] res, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(nums, indexes, res, l, mid);
        mergeSort(nums, indexes, res, mid + 1, r);
        merge(nums, indexes, res, l, mid, r);
    }

    private void merge(int[] nums, int[] indexes, Integer[] res, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0, rightCount = 0;

        while (i <= mid && j <= r) {
            if (nums[indexes[j]] < nums[indexes[i]]) {
                temp[k++] = indexes[j++];
                rightCount++;
            } else {
                res[indexes[i]] += rightCount;
                temp[k++] = indexes[i++];
            }
        }

        while (i <= mid) {
            res[indexes[i]] += rightCount;
            temp[k++] = indexes[i++];
        }
        while (j <= r) temp[k++] = indexes[j++];

        for (i = 0; i < temp.length; i++) {
            indexes[l + i] = temp[i];
        }
    }
}