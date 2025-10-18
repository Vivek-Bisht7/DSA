class Solution {
    public HashSet<List<Integer>> backtrack(int[] nums, HashSet<List<Integer>> set, List<Integer> list,
            boolean[] flag) {
        if (list.size() == nums.length) {
            set.add(new ArrayList<>(list));
            return set;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!flag[i]) {
                flag[i] = true;
                list.add(nums[i]);
                backtrack(nums, set, list, flag);
                flag[i] = false;
                list.remove(list.size() - 1);
            }

        }
        return set;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set = backtrack(nums, new HashSet<>(), new ArrayList<>(), new boolean[nums.length]);
        List<List<Integer>> result = new ArrayList<>(set);

        return result;
    }
}