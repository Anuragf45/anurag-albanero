public class inheritence {
    public static void main(String[] args) {
        val v1=new val();
        v1.a=45;
        v1.setVal(87);
        marks m1=new marks();
        m1.subject="English";
        m1.a=54;
        m1.setVal(99);
        System.out.println(m1.getVal());
    }
}

class val{
    int a;
    int getVal(){
        return a;
    }
    int setVal(int x){
        this.a=x;
        return a;
    }
}

class marks extends val{
    String subject;

}

//here inheritence is going on, class marks is getting the properties of class val by using extends keyword.