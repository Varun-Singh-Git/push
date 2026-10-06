class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        // Count frequency of every element in arr1
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // Put elements according to arr2 order
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index] = num;
                index++;
                count[num]--;
            }
        }

        // Put remaining elements in ascending order
        for (int num = 0; num <= 1000; num++) {
            while (count[num] > 0) {
                arr1[index] = num;
                index++;
                count[num]--;
            }
        }

        return arr1;
    }
}
