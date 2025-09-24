class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            int index = digits.length - 1;

            while (index > -1 && digits[index] == 9)
                index--;

            if (index == -1) {
                int temp[] = new int[digits.length + 1];
                temp[0] = 1;
                return temp;
            }
            else{
                digits[index++] += 1;
                for(int i=index; i<digits.length; i++){
                    digits[i]=0;
                }

                return digits;
            }

        }
    }
}