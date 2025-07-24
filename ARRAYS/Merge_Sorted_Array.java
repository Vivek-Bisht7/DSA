// Brute force (Extra space)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0 , left = 0 , right = 0;
        int[] result = new int[m+n];

        while(left<m && right <n){
            if(nums1[left]<=nums2[right]){
                result[index++] = nums1[left++];
            }
            else{
                result[index++] = nums2[right++];
            }
        }
        while(left<m){
            result[index++] = nums1[left++];
        }
        while(right<n){
            result[index++] = nums2[right++];
        }

        for(int i=0; i<n+m; i++){
            nums1[i] = result[i];
        }
    }
}

// Better - using built-in function for sorting

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m; i<m+n; i++){
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
}

// Optimal 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1 , j = n-1 , k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[k--] = nums2[j--];
            }
            else{
                nums1[k--] = nums1[i--];
            }
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}