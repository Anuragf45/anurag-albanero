public class functional_interface {
    public static void main(String[] args) {
sayingSomething s1=new sayingSomething();
s1.say("Hello how are you");
    }
}



interface sayable{
    void say(String s);
}

 class sayingSomething implements sayable{
    @Override
    public void say(String s) {
        System.out.println(s);
    }
}

/*
* Here above functional interface has been performed
* */