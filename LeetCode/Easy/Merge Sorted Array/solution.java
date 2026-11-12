class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            temp[k++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            temp[k++] = nums2[i];
        }
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - i - 1; j++) {

                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
}
