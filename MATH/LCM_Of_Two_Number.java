import java.util.*;

public class Main{
    public static int GCD(int a , int b){
       
        if(b==0){
            return a;
        }
        
        while(a%b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        
        return b;
        
    }
    
    public static void LCM(Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println((a*b)/GCD(a,b));
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            LCM(sc);
        }
    }
}