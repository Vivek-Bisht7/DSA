class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(true){
            int sum = 0;

            while(n>0){
                int rem = n%10;

                sum += rem*rem;

                n /= 10;
            }

            if(sum==1) return true;
            else{
                if(set.contains(sum)) return false;
                else set.add(sum);
            }
            n = sum;
        }
    }
}