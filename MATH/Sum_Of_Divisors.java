import java.util.*;

class Main{
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        
        if(n==1){
            System.out.println(1);
            return;
        }
        
        int sum = n+1;
        
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                
                if(i*i==n){
                    sum+=i;
                }
                else{
                    sum += i + (n/i);
                }
            }
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of numbers to be checked : ");
        int t = sc.nextInt();
        
        while(t-->0){
            solve(sc);
        }
    }
}