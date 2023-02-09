public class accessModifiers {
    public static void main(String[] args) {

        String s="Anurag";
        String res="";
        for(int i=s.length();i>0;i--){
            char a= s.charAt(i);
            res=res+a;
        }

        System.out.println(res);
    }
}

