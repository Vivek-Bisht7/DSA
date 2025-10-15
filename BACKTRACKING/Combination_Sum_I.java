// pure recursion approach

// classic backtracking template

// do something -> call for +1 -> do something and remove the latest element -> call for +1

// this problem backtracking template

// do something -> call for same index -> remove the last added elem -> again call for index+1

class Solution {
    public void f(int index,List<Integer> ds , List<List<Integer>> result , int[] candidates , int target){
        if(target==0){
            result.add(new ArrayList<>(ds));
            return;
        }
        if(target<0 || index==candidates.length) return;

        ds.add(candidates[index]);
        f(index,ds,result,candidates,target-candidates[index]);
        ds.remove(ds.size()-1);
        f(index+1,ds,result,candidates,target);

        return;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        f(0,ds,result,candidates,target);

        return result;
    }
}