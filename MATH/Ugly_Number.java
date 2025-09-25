// brute force

class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        if(n==1) return true;

        HashSet<Integer> set = new HashSet<>();

        while(n%2==0){
            set.add(2);
            n=n/2;
        }

        for(int i=3; i*i<=n; i=i+2){
            while(n%i==0){
                set.add(i);
                n/=i;
            }
        }

        if(n>1) set.add(n);

        int count=0;

        if(set.contains(2)) count++;
        if(set.contains(3)) count++;
        if(set.contains(5)) count++;

        if(count==0 || count<set.size()) return false;

        return true;
    }
}

// optimized

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;  
        
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        
        return n == 1;
    }
}