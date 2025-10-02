class Main {
    public static int f(int n){
        if(n==0) return 0;
    
        return f(n/10) + n%10;
    }
    
    public static void main(String[] args) {
            System.out.println(f(1234));
    }
}