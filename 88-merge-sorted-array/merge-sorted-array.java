class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;
        int last = m + n - 1;

        while (second >= 0){

            if ( first >=0 && nums1[first] > nums2[second]){
                nums1[last] = nums1[first];
                last --;
                first--;
            }else{
                nums1[last] = nums2[second];
                last--;
                second--;
            }
            //last --;
        }
    }
}

