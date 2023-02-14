import java.util.*;
public class practice2 {
    public static void main(String[] args) {
//        int arr[]={2,3,4,5,6};
//        System.out.println(arr);

     List<Integer> list =new ArrayList<Integer>();
    list.add(67);
    list.add(78);
      //  System.out.println(list);
     list.add(99);
       // System.out.println(list);
       int a= list.get(2);
       // System.out.println(a);
        List<Integer> newList=new ArrayList<Integer>();
        newList.add(87);
        newList.add(98);
        list.addAll(newList);
        list.add(1,1000);
        //System.out.println(list);
//        List<String> list =new ArrayList<String>();
//        list.add("Anurag");
//        list.add("Srivastava");
//        System.out.println(list);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        for(Integer element: list){
            System.out.println(element);
        }
    }
}
