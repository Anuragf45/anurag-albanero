public class java8 {
    public static void main(String[] args) {
//        var a=44; //var is a feature of java 10 which can be used to declare a local variable.
//        System.out.println(a);


        // now below we are implementing lambda expresion
//        int width= 45;
//        int length=10;
//        drawable d1= ()->{  //lambda expression is another update of java 8;
//            System.out.println("drawable "+ length +" "+ width);
//        };
//       d1.draw();

        //now below implementing method references;

//       drawable draw1=java11::saySomething;  //this is method referencing syntax.
//       draw1.draw();

    }
//    public static void saySomething(){
//        System.out.println("I'm saying some thing");
//    };
}

interface  drawable{
    void draw();
}




/*features of java 8==>
1-lambda expression
2-method reference
3-functional interference
*/