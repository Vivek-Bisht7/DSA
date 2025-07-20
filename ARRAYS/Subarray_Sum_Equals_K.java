// Brute force is simple generate all subarrays


// Optimal 

// Intiliaze a hashmap and put an key value pair of 0:1 in it ...On each iteration generate prefix sum and then check that prefixsum - k is present in the hashmap then the value of that from the map should be added in it if it does not contain prefixsum - k then it should be add to hashmap

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // if prefixsum - k is 0 that means the current subarray sum to k
        map.put(0,1);
        int prefixSum = 0 , count = 0;

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;
            count += map.getOrDefault(remove,0);
            map.put(prefixSum , map.getOrDefault(prefixSum ,0)+1);
        }

        return count;
    }
}