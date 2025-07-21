// Brute force -- Cause TLE as O(N3) 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for(int i =0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k =j+1; k<nums.length; k++){
                    if(i==j || i==k || j==k){
                        continue;
                    }

                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}


//Better 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            HashSet<Integer> set2 = new HashSet<>();
            for(int j=i+1; j<n; j++){
            
                int k = -(nums[i]+nums[j]);
                
                if(set2.contains(k)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(k);
                    Collections.sort(temp);
                    set.add(temp);
                }
                set2.add(nums[j]);

            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);

        return ans;
    }
}

// Not further optimised yet