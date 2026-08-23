public class ArrayPointerProblems {
    class Solution {
        public int maximumWealth(int[][] accounts) {

            int max = 0;

            for (int i = 0; i < accounts.length; i++) {

                int sum = 0;

                for (int j = 0; j < accounts[i].length; j++) {
                    sum = sum + accounts[i][j];
                }

                if (sum > max) {
                    max = sum;
                }
            }

            return max;
        }

        public int removeElement(int[] nums, int val) {

            int k = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k;
        }
    }
}
