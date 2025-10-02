class Main {
    public static int[] f(int[] arr , int start , int end){
        if(start>=end) return arr;
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        return f(arr,start+1,end-1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        int[] a = f(arr,0,arr.length-1);
        
        for(int temp : a){
            System.out.println(temp);
        }
    }
}