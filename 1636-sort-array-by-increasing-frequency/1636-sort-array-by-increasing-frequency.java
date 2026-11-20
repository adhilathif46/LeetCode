class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];
        // Step 1: Count frequency
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j] && i != j) {
                    freq[i]++;
                }
            }
        }
        // Step 2: Sort based on frequency
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[i] > freq[j] ||
                   (freq[i] == freq[j] && nums[i] < nums[j])) {
                    // Swap numbers
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    // Swap frequencies
                    int tempFreq = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempFreq;
                }
            }
        }
        return nums;
    }
}
