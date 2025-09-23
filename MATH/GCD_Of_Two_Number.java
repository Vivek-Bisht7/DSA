import java.util.*;

public class Main{
    public static void solve(Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(b==0){
            System.out.println(a);
            return;
        }
        
        while(a%b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        
        System.out.println(b);
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            solve(sc);
        }
    }
}