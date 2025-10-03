class Main {
    public static int f(int[] arr , int target , int index){
        if(index==arr.length) return 0;
        
        if(arr[index]==target){
            return 1+f(arr,target,index+1);
        }
        else{
            return f(arr,target,index+1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,0,4,5,6,4,3};
        System.out.println(f(arr,9,0));
    }
}