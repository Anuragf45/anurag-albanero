public class exception_handling {
    public static void main(String[] args) {
        try{
            System.out.println(100/1);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
