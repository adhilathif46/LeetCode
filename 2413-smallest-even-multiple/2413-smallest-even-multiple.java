class Solution {
    public int smallestEvenMultiple(int n) {
        if(n <= 0){
            return 0;
        }
        int i=1;
        while(true){
            if(i % 2 == 0 && i % n == 0){
                return i;
            }
            i++;
        }
    }
}