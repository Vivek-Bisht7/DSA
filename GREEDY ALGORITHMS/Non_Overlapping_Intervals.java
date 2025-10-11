class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[1], b[1]));

        int temp = intervals[0][1] , count = 0;

        for(int i=1; i<intervals.length; i++){
            if(temp > intervals[i][0]){
                count++;
            }
            else{
                temp = intervals[i][1];
            }
        }

        return count;
    }
}