class Solution {
    public int maxProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // Track the two maximums
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Track the two minimums
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int p1 = (max1 - 1) * (max2 - 1);
        int p2 = (min1 - 1) * (min2 - 1);

        return Math.max(p1, p2);
    }
}