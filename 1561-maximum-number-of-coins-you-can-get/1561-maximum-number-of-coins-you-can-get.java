class Solution {
        public int maxCoins(int[] A) {
        Arrays.sort(A);
        int res = 0;
        for (int i = A.length / 3; i < A.length; i += 2)
            res = res + A[i];
        return res;
    }
}