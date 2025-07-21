// brute force = simple use hashmap 

// Optimal - Booth's moore optimal algorithm enhanced version

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int elem1 = Integer.MAX_VALUE, elem2 = Integer.MAX_VALUE;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elem1) {
                count1++;
            } else if (nums[i] == elem2) {
                count2++;
            } else if (count1 == 0) {
                elem1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                elem2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }

        }

        int actualCount1 = 0, actualCount2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elem1) {
                actualCount1++;
            }
            if (nums[i] == elem2) {
                actualCount2++;
            }
        }

        if (actualCount1 > nums.length / 3)
            ans.add(elem1);
        if (actualCount2 > nums.length / 3)
            ans.add(elem2);

        return ans;

    }
}