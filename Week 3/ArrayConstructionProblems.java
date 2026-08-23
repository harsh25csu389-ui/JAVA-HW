public class ArrayConstructionProblems {
    class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}


    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }



    public int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }


    public int[] runningSum(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }

        return nums;
    }

}
