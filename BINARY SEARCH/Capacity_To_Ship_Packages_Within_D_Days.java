class Solution {
    public int sum(int[] weights){
        int s = 0;

        for(int weight : weights){
            s += weight;
        }

        return s;
    }

    public int max(int[] weights){
        int m = Integer.MIN_VALUE;

        for(int weight : weights){
            if(m<weight) m = weight;
        }

        return m;
    }

    //isme find karo ki iss capacity ke saath kitne din lag jayenge samaan pahuchane mai aur accordingly T/F return kardo...
    
    public boolean isValid(int[] weights , int days , int capacity){
        int count = 1 , currentWeight = 0;

        for(int weight : weights){
            if((currentWeight+weight)>capacity){
                count++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }

        return count<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int totalWeight = sum(weights);
        int  low = max(weights) , high = totalWeight;

        while(low<=high){
            int mid = (low + high)/2;

            if(isValid(weights,days,mid)) high = mid-1;
            else low = mid+1;
        }

        return low;
    }
}