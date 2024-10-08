/*
 * @lc app=leetcode id=1395 lang=java
 *
 * [1395] Count Number of Teams
 */

// @lc code=start
class Solution {
    public int numTeams(int[] arr) {
        int count = 0;
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            int leftSmaller = 0, rightLarger = 0;
            int leftLarger = 0, rightSmaller = 0;
            for (int i = 0; i < j; i++) {
                if (arr[i] < arr[j]) {
                    leftSmaller++;
                } else if (arr[i] > arr[j]) {
                    leftLarger++;
                }
            }
            for (int k = j + 1; k < len; k++) {
                if (arr[j] < arr[k]) {
                    rightLarger++;
                } else if (arr[j] > arr[k]) {
                    rightSmaller++;
                }
            }
            count += leftSmaller * rightLarger + leftLarger * rightSmaller;
        }
        return count;
    }
}
// @lc code=end

