class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int res = 0;

        for(int i=0; i<boxTypes.length; i++){
            int temp = Math.min(boxTypes[i][0],truckSize);
            res+= temp*boxTypes[i][1];
            truckSize-=temp;
        }


        return res;
    }
}