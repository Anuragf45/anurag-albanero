import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<String> elements=new Stack<>();
        elements.push("Rohit");
        elements.push("Shubman Gill");
        elements.push("Virat");

       // System.out.println(elements);
        elements.pop();
        System.out.println(elements);

    }
}
