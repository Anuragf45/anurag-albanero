public class OOPS {
    public static void main(String[] args) {

        Triangle T1=new Triangle();
        T1.color="blue";
        System.out.println(T1.color);
    }
}

class shape{
    String color;

}
class Triangle extends shape{
    String name;
}

//inheritence==> When a class inherits or adapts properties of another class then it could be considered as inheritence;
