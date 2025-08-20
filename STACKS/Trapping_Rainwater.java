// brute force

class Solution {
    public int[] calculatePrefix(int[] height){
        int[] prefix = new int[height.length];

        prefix[0] = height[0];

        for(int i=1; i<height.length; i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }

        return prefix;
    }

    public int[] calculateSuffix(int[] height){
        int[] suffix = new int[height.length];

        int n = height.length-1;

        suffix[n] = height[n];

        for(int i=n-1; i>=0; i--){
            suffix[i] = Math.max(suffix[i+1],height[i]);
        }

        return suffix;
    }

    public int trap(int[] height) {
        int[] prefix = calculatePrefix(height);
        int[] suffix = calculateSuffix(height);

        int total = 0;

        for(int i=0; i<height.length; i++){
            total += Math.min(prefix[i],suffix[i])-height[i];
        }
    
        return total;
    }
}

// optimal

class Solution {
    public int trap(int[] height) {
        int leftMax = 0 ,rightMax = 0 ,total = 0;
        int l = 0 , r = height.length-1;

        while(l<r){
            if(height[l]<=height[r]){
                if(leftMax>height[l]){
                    total+=leftMax-height[l];
                }
                else{
                    leftMax = height[l];
                }
                l++;
            }
            else{
                if(rightMax>height[r]){
                    total += rightMax-height[r];
                }
                else{
                    rightMax = height[r];
                }
                r--;
            }
        }

        return total;
    }
}