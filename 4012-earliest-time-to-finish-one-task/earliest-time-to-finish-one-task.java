class Solution {
    public int earliestTime(int[][] tasks) {
        int res = Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            if(tasks[i][0] + tasks[i][1] < res){
                 res = tasks[i][0] + tasks[i][1];
            }
        }
        return res;
    }
}