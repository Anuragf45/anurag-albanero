import java.io.*;
public class serialization {
    public static void main(String[] args) {
           emp s1=new emp();
           s1.name="Anurag";
           s1.id=1;
        try{
            //Creating the object

            System.out.println(s1.id +" "+ s1.name);
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("f1.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
    }
}
