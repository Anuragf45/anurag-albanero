import java.util.*;
public class encapsulation {
    public static void main(String[] args) {
  Area a1=new Area(5,4);
  a1.getArea();
    }

}

class Area{
    int length;
    int breadth;
    Area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void getArea(){
      int  area= length*breadth;
        System.out.println("Area is "+ area);
    }
}