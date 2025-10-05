// Approach-1

class Solution {
    public static List<List<Integer>> solve(int[] nums,int index,List<Integer> ds,List<List<Integer>> res){
        if(nums.length==index){
            res.add(new ArrayList<>(ds));
            return res;
        }

        ds.add(nums[index]);
        solve(nums,index+1,ds,res);
        ds.remove(ds.size()-1);
        solve(nums,index+1,ds,res);

        return res;
    }

    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(nums, 0, ds, res);

        int xor = 0 ,sum = 0;

        for(List<Integer> temp : res){
            for(int x : temp){
                xor ^= x;
            }
            sum += xor;
            xor = 0;
        }

        return sum;
    }
}

// Approach-2

class Solution {
    public static int solve(int[] nums,int index , int Xor){
        if(nums.length==index){
            return Xor;
        }
        int include = solve(nums,index+1, Xor^nums[index]);
        int exclude = solve(nums,index+1,Xor);

        return include + exclude;
    }

    public int subsetXORSum(int[] nums) {
        
        return solve(nums, 0 ,0);
    }
}

// Approach -3 

// take out bitwise xor of all and then append n-1 zeroes at last 
