import java.util.*;
public class Array_list {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(45);
        list.add(18);

        List<Integer> newList=new ArrayList<Integer>();
        newList.add(1000);
        System.out.println(list.get(1));
        list.addAll(newList);
        System.out.println(list);
        for(Integer element:list){
            System.out.println(element);
        }
    }
}
