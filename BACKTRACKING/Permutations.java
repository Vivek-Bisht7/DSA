class Solution {
    public List<List<Integer>> solve(List<List<Integer>> result,List<Integer> ds , int[] nums , boolean[] flag){
        if(ds.size() == nums.length){
            result.add(new ArrayList<>(ds));
            return result;
        }

        for(int i=0; i<nums.length; i++){
            if(!flag[i]){
                flag[i]=true;
                ds.add(nums[i]);
                solve(result,ds,nums,flag);
                flag[i]=false;
                ds.remove(ds.size()-1);
            }
        }

        return result;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];

        return solve(result,ds,nums,flag);
    }
}