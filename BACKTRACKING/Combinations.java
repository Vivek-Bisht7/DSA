class Solution {
    public static List<List<Integer>> f(List<Integer> ds,List<List<Integer>> res,int n , int k , int i){
        if(ds.size()==k){
            res.add(new ArrayList<>(ds));
            return res;
        }

        if(i<=n){
            ds.add(i);
        }
        else{
            return res;
        }

        f(ds,res,n,k,i+1);
        ds.remove(ds.size()-1);
        f(ds,res,n,k,i+1);
        return res;
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        return f(ds,res,n,k,1);
    }
}