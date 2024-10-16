import java.io.*;
class Bike{
    void run(){
        System.out.println("Bike is running");
    }
}
class Honda extends Bike{
    void run()
    {
        System.out.println("Honda is running");
    }
}
class DMD_Demo{
    public static void main (String[] args) {
        Bike a=new Bike();
        Honda h=new Honda();
        Bike b=new Honda();
        b.run();
    }
}
