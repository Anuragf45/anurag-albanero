import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java11 {
    public static void main(String[] args) {

      List<Integer> list =new ArrayList<Integer>();
      list.add(45);
      list.add(1);
      list.add(100);
        Stream<Integer> list2=list.stream().sorted();
        list2.forEach(System.out::print );
    }
}



//var j10