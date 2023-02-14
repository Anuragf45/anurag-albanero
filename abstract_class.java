public class abstract_class {
    public static void main(String[] args) {
child c1=new child();
c1.greet();
    }
}


abstract class parent{
 abstract public void greet();
}

 class child extends parent{
    public void greet(){
        System.out.println("Good morning");
    }
}


//A restricted class which cannot create objects can be considered as an abstract class.
