class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for (int i = 0; i < heights.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > heights[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tempHeight = heights[i];
            heights[i] = heights[maxIndex];
            heights[maxIndex] = tempHeight;
            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;
        }
        return names;
    }
}