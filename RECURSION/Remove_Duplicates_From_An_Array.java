class Main {
    public static String f(String str , int index , String res){
       if(str.length()==index) return res;
       
       char ch = str.charAt(index);
       
       if(res.indexOf(ch)==-1){
           res += ch;
       }
       
       return f(str,index+1,res);
    }
    
    public static void main(String[] args) {
        System.out.println(f("tommorrow",0,""));
    }
}