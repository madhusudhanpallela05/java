import java.io.*;
class Animal{
    String color="White";
    void eat(){
        System.out.println("Animal is eating");
    }
    }
    class Dog extends Animal{
        String color="Black";
        void printcolor(){
            System.out.println("dog color is:"+color);
            System.out.println("Animal color is"+super.color);
        }
        void eat(){
        System.out.println("Dog is eating");
    }
    void bark(){
        System.out.println("Dog is barking ");
    }
    void work(){
        super.eat();
        printcolor();
        bark();
        eat();
        
    }
    }
    class SuperDemo2{
        public static void main (String[] args) {
            Dog d=new Dog();
            d.work();
            
        }
        
    }
