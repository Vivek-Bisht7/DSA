//Brute force

class Solution {
    public int addDigits(int num) {
        while(num>9){
            int temp = 0;

            while(num!=0){
                int rem = num%10;
                temp += rem;
                num /= 10;
            }
            num = temp;
        }

        return num;
    }
}


//Optimize T.C - O(1)

class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;

        int res = num%9;

        return (res==0)? 9 : res; 

    }
}