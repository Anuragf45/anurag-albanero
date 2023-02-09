public class palindrome {
    public static void main(String[] args) {

    String s="aba";  //for strings
    String res="";
      for(int i=s.length()-1;i>=0;i--){
          res=res+s.charAt(i);
      }
       if(res==s){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not palindrome");
       }
    }

//    public static void main(String[] args) {
//        int n=121;  //for numbers
//        int temp=n;
//        int r=0;
//        int res=0;
//       while(n>0){
//           r=n%10;
//           res=(res*10)+r;
//           n=n/10;
//       }
//
//      //  System.out.println(temp+" "+res);
//       if(res==temp){
//           System.out.println("palindrome");
//       }else{
//           System.out.println("not a palindrome");
//       }
//    }

}
