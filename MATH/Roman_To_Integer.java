class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int prevValue = 0 , sum = 0;
        
        for(char c : s.toCharArray()){
            int value = map.get(c);

            if(prevValue < value){
                sum -= prevValue*2;
            }
            sum += value;
            prevValue = value;
        }

        return sum;
    }
}