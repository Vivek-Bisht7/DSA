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

// optimised = Two points + sorting

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                int value = nums[i] + nums[j] + nums[k];

                if (value == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                } else if (value > 0) {
                    k--;
                } else {
                    j++;
                }

            }

        }
        return ans;

    }
}