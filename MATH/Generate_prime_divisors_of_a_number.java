import java.util.*;

class Main{
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        
        HashSet<Integer> set = new HashSet<>();
        
        if(n<2){
            System.out.println("Only +ve nubmers are allowed");
            return;
        }
        
        if(n%2 == 0){
            
            set.add(2);
            
            while(n%2 == 0){
                n/=2;
            }
        }
        
        for(int i=3; i*i<=n; i=i+2){
            while(n%i==0){
                set.add(i);
                n/=i;
            }
        }
        
        if(n>1) set.add(n);
        
        for(int temp : set){
            System.out.print(temp + " ");
        }
        System.out.println("");
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