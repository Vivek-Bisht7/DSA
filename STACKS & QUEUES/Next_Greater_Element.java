// Brute force

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[n];

        Arrays.fill(ans,-1);

        for(int i=0 ; i<n; i++){

            boolean findNow = false;

            for(int j=0; j<m; j++){
                if(nums1[i]==nums2[j]){
                    findNow = true;
                    continue;
                }
                if(findNow){
                    if(nums1[i]<nums2[j]){
                        ans[i] = nums2[j];
                        break;
                    }
                }
            }
        }

        return ans;
    }
}

// Optimal

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[n];

        Arrays.fill(ans,-1);

       Stack<Integer> st = new Stack<>();
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int current : nums2){
                while(!st.isEmpty() && st.peek()<current){
                    int temp = st.pop();

                    map.put(temp,current);
                }
            st.push(current);
       }

    
       for(int i=0; i<n;  i++){
            ans[i] = map.getOrDefault(nums1[i],-1);
       }

        return ans;
    }
}