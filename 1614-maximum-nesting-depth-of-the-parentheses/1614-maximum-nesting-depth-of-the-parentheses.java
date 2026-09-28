class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int depth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
            } 
            else if (ch == ')') {
                depth--;
            }
            if (depth > ans) {
                ans = depth;
            }
        }
        return ans;
    }
}