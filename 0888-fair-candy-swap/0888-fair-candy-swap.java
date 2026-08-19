class Solution{
    public int[] fairCandySwap(int[] A, int[] B) {
    int sumA = 0;
    int sumB = 0;
    for (int x : A){
        sumA += x;
    }
    for (int x : B){
        sumB += x;
    }
    int dif = (sumA - sumB) / 2;
    for (int a : A) {
        for (int b : B) {
            if (a - b == dif) {
                return new int[]{a, b};
            }
        }
    }
    return new int[0];
}
}