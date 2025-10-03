class Main {
    public static void f(String str , int index , StringBuilder current){
        
        if(index==str.length()){
            System.out.println(current);
            return;
        }
       
       current.append(str.charAt(index));
       f(str,index+1,current);
       current.deleteCharAt(current.length()-1);
       f(str,index+1,current);
    }
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        f("abc",0,sb);
    }
}