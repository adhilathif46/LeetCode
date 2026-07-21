class Solution {
    public int trap(int[] height) {
        int max = 0, n = height.length;

        for (int i = 0; i < n; i++) {
            if (height[max] < height[i]) {
                max = i;
            }
        }

        int sum = 0;
        int LeftMax = 0;

        for (int i = 0; i < max; i++) {
            if (height[LeftMax] < height[i]) {
                LeftMax = i;
            }
            sum += Math.min(height[LeftMax], height[max]) - height[i];
        }

        int RightMax = n - 1;

        for (int i = n - 1; i > max; i--) {
            if (height[RightMax] < height[i]) {
                RightMax = i;
            }
            sum += Math.min(height[max], height[RightMax]) - height[i];
        }

        return sum;
    }
}