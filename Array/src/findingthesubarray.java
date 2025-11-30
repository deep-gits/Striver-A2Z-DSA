import java.util.HashMap;

class Solution {
    public static int lenOfLongSubarr(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];


            if (currentSum == k) {
                maxLen = i + 1;
            }


            if (map.containsKey(currentSum - k)) {
                int previousIndex = map.get(currentSum - k);
                int currentLen = i - previousIndex;
                maxLen = Math.max(maxLen, currentLen);
            }


            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Length: " + lenOfLongSubarr(nums, k));
    }
}