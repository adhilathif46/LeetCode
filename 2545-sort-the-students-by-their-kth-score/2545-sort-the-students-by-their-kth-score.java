class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int size = score.length;
        for(int row = 0;row < size - 1;row++){
            for(int col = 0;col < size-row-1;col++){
                if(score[col][k] < score[col + 1][k]){
                    int[] temp = score[col];
                    score[col] = score[col+1];
                    score[col+1] = temp;
                }
            }
        }
        return score;
    }
}