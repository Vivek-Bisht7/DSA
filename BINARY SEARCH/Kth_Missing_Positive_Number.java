//Brute force 

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length-1;
        ArrayList<Integer> missing = new ArrayList<>();

        int temp = 0;
        for(int i = 1 ; i<=arr[n]; i++){
            if(arr[temp]==i){
                temp++;
            }
            else{
                missing.add(i);
            }
        }

        if(missing.size()>=k){
            return missing.get(k-1);
        }
        else{
            return (k-missing.size())+arr[n];
        }

    }
}

//Another better brute force (not by me ) (same T.C. as above)

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        int index = 0;

        for (int i = 1; al.size() < k; i++) {
            if (index < n && arr[index] == i) {
                index++;
            } else {
                al.add(i);
            }
        }

        return al.get(k - 1);
    }
}

//Optimized (Binary Search)

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length-1;

        if(arr[n]==n+1) return arr[n]+k;

        int low = 0 , high = n , missingNumbers=0;

        while(low<=high){
            int mid = (low + high)/2;

            missingNumbers = (arr[mid]-(mid+1));

            if(k<=missingNumbers){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low+k;
    }
}

