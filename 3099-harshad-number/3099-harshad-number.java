class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        for (int i = x; i > 0; i--){
            int lst = x%10;
            sum += lst;
            x /= 10;
        }
        if(temp%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}