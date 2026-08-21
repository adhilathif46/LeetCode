class Solution {
    public int[] minOperations(String boxes) {
    int[] res = new int[boxes.length()];
    for (int i = 0, ops = 0, cnt = 0; i < boxes.length(); ++i) {
        res[i] += ops;
        if (boxes.charAt(i) == '1') {
            cnt++;
        }
        ops += cnt;
    }
    for (int i = boxes.length() - 1, ops = 0, cnt = 0; i >= 0; --i) {
        res[i] += ops;
        if (boxes.charAt(i) == '1') {
            cnt++;
        }
        ops += cnt;
    }
    return res;
}
}