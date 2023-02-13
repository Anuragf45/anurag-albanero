
public class am {

    public static void main(String[] args) {
        c1 c=new c1();
//       c.meth1();
        System.out.println(c.d);
    }
}

class c1{
    public int x=10;
    private int y=45;
    int c=22;
    protected int d=100;

    public void meth1(){
        System.out.println(c);
    }
}