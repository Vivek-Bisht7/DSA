class Main {
    public static boolean f(String s , int start , int end){
       if(start>=end) return true;
       if(s.charAt(start)!=s.charAt(end)) return false;
       return f(s,start+1,end-1);
    }
    
    public static void main(String[] args) {
            System.out.println(f("abcdba",0,5));
    }
}