public class classes {
    public static void main(String args[]){
    Pen p1=new Pen();
    p1.name="Trimax";
    p1.price=45;
        System.out.println("Price of pen p1 is "+p1.price);
        System.out.println("Name of pen P1 is "+ p1.name);
    }
}


class Pen{
    String name;
    int price;
}