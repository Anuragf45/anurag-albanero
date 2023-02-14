import  java.util.*;
import java.util.Arrays;
public class array_class {
    public static void main(String[] args) {
        Integer numbers[]={2,3,53,2,4,5,2,5,1,7,5};
         Arrays.sort(numbers);
       for(int i:numbers){
           System.out.print(i + " ");
       }
    }
}
