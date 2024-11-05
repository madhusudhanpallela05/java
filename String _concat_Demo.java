import java.io.*;
import java.util.*;
import java.lang.String;
public class String_concat_Demo{
    public static void main(String args[]){
        String s1="Hello";
        String s2="World";
        String s3=s1.concat(s2);
        System.out.println("The result of s1 concat s2 is "+s3);
        String s4="SASISITEWELCOMEHELLO";
        String s5=s4.join("WEL",s2);
        System.out.println("The result join with s2 is "+s5);
        System.out.println("The result of s1 +s2 is "+(s1+s2));

    }
}
