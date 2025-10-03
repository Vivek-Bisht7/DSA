class Main {
    public static int f(int[] arr , int index){
        if(index == arr.length-1) return arr[index];
        return Math.max(f(arr,index+1),arr[index]);
    }
    
    public static void main(String[] args) {
        int[] arr = {2,5,67,12,34,11,24,0,7};
        System.out.println(f(arr,0));
    }
}