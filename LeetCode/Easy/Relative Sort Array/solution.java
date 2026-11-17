
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] count = new int[1001];

        // Count frequency of elements in arr1
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // First place elements according to arr2
        for (int num : arr2) {

            while (count[num] > 0) {
                arr1[index] = num;
                index++;
                count[num]--;
            }
        }

        // Place remaining elements in ascending order
        for (int i = 0; i < 1001; i++) {

            while (count[i] > 0) {
                arr1[index] = i;
                index++;
                count[i]--;
            }
        }

        return arr1;
    }
}
