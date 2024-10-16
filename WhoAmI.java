import java.io.*;
class A{
    void callMe(){
        System.out.println("I am from A");
    }
}
class B extends A{
    void callMe()
    {
        System.out.println("I am from B");
    }
}
class WhoAmI{
    public static void main (String[] args) {
        A a=new A();
        A h=new B();
        B b=new B();
        a.callMe();
        h.callMe();
        b.callMe();
        
    }
}
