import java.util.*;

class Main{
    public static void solve(Scanner sc){
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        if(n<=1){
            System.out.println(n + " is neither prime nor composite");
            return;
        }
        
        boolean flag = true;
        
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        
        if(flag){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " is composite");
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of numbers to be checked: ");
        int t = sc.nextInt();
        
        while(t-->0){
            solve(sc);
        }
    }
}