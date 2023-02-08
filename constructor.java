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