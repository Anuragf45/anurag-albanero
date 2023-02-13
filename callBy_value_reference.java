public class callBy_value_reference {

    public static void change(int a ){
        a=a+10;
        System.out.println(a);
    }
    public static void main(String[] args) {
       operation p1=new operation();
       p1.val=45;
       int a=100;
        System.out.println(a);
        System.out.println(p1.val);
        change(a);
        change(p1.val);
        System.out.println("after change"+a);
        System.out.println("after change "+p1.val);
    }
}

class operation{
  int val;

}