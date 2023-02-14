import java.util.Scanner;

class interface1{
    public static void main(String[] args) {
client d1=new developer();
d1.input();
d1.output();

    }
}

interface  client{
  void input();
    void output();
}

 class developer implements client{
    String name;
    double salary;
   public void input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter users name");
       name =sc.next();
       System.out.println("Enter salary");
       salary=sc.nextDouble();
    }

    public void output(){
        System.out.println(this.name +"'s salary is Rs."+ this.salary);
    }
}


//interface are like classes which are used to achieve abstraction.Here we have used implements keyword to extend the
//propeerties of developer into clinet