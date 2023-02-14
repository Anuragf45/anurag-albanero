import java.util.*;
public class queue_linkedList {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(54);
        //queue.offer(99);
        queue.remove();
        System.out.println(queue);
    }
}

//we can use add and remove but we use offer and poll just for getting rid of exceptions.offer and poll returns false while others returns exceptions in failure.