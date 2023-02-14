import java.util.*;
public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> list=new ArrayDeque<Integer>();
        list.offer(45);
        list.offerFirst(63);
        list.offerLast(18);

        System.out.println(list);
    }
}


//like offerfirst there are functions also pollfirst(),pollLast() and poll();