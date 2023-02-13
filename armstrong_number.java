public class armstrong_number {
    public static void main(String[] args) {
        int n=371;
        int count=0;
        int temp=n;
        int res=n;
        while(n>0){
            n=n/10;
            count++;
        }
        int pow=count;
        int sum=0;
        while(count>0){
            int last=temp%10;
//            System.out.println("last is "+last);
            sum+=(Math.pow(last,pow));
//            System.out.println("Sum is "+sum);
            temp=temp/10;
            count--;
        }

     if(sum==res){
         System.out.println("armstrong number");
     }else{
         System.out.println("not a armstrong");
     }
    }
}
