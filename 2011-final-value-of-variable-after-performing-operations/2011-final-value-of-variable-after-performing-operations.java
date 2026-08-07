class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str : operations) {
            x += (44 - str.charAt(1));
        }
        return x;
    }
}