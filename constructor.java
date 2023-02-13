public class constructor {
public static void main(String args[]){

    book b1=new book();  //here new is constructor which is constructing a new instance of the class book
    b1.Subject="Introduction to Java";
    b1.price=400;
    System.out.println(b1.Subject);
    System.out.println(b1.price);
}
}

class book{
    int price;
    String Subject;
}

//constructors are of actually two types=>
// no args constructor ==>which does not have any kind of arguments and not even parameters.
// parameterized constructor ==> which have arguments into it and while calling constructor it requires parameters accordingly.
