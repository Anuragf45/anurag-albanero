import java.io.*;
public class deserialization {
    public static void main(String[] args) {
        try{
          ObjectInputStream in=new ObjectInputStream(new FileInputStream("f1.txt"));
            emp s1=(emp)in.readObject();
            System.out.println(s1.id+" "+s1.name);
            in.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


//here the object s1 is being deserialized and serialized data has been stored in f1.txt which was created while serialization.
