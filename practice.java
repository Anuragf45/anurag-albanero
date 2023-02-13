


import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class practice {
    public static void main(String[] args) {
   operation22 O1=new operation22();
   int data=455;
       // System.out.println(data);
   O1.change(data);
        System.out.println(data);
    }
}

class operation22{
    int data;
  void  change(int val){
       val=val+100;
      System.out.println(val);
  }
}