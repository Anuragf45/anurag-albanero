import java.util.*;

public class forEach {
    public static void main(String[] args) {
        List<Integer>  list=new ArrayList<Integer>();
        list.add(45);
        list.add(76);
        list.add(18);
    list.forEach(System.out::println);
    }
}

//here we have used for Each in whcih is the new feature of java came with java 8.