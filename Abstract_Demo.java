import java.io.*;
abstract class Base{
    abstract void fun();

}
class Derived extends Base{
    void fun()
    {
        System.out.println("Derived fun is invoked ");

    }
}
class Abstract_Demo
{
    public static void main(String args[])
    {
        //Base b=new Base();
        Derived D=new Derived();
        D.fun();
        Base b=new Derived();
         b.fun();
    }
}
