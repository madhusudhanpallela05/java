import java.io.*;
import java.util.*;
import java.lang.String;
class StringDemo{
    public static void main(String args[])
    {
        String s1="Welcome";
        String s2=new String("Welcome");
        String s3="Wel";
        boolean x=s1.equals(s2);
        System.out.println("s1 and s2 are equal"+x);
        boolean x=s1.equals(s3);
        System.out.println("s1 and s3 are equal"+x);
        System.out.println("The character at 4th positionn in s3 is "+s3.charAt(4));
        System.out.println("The character at 4th positionn in s1 is "+s1.charAt(4));
        System.out.println("Length of s1 is "+s1.length());
        System.out.println("s1 in upper case is:"+s1.toUpperCase());
        System.out.println("the substring from 2,5 in s1 is "+s1.substring(2,5));
        System.out.println("The index of c in s2 is "+s2.indexOf('c'));
        System.out.println("After concatinating s1 &s3 is "+s1.concat(s3));
        System.out.println("After concatinating s1 &s3 is "+s3.concat(s1));
        System.out.println("S1 conatains s3  "+s1.contains(s3));
        System.out.println("S3 conatains s1  "+s3.contains(s1));
    }
}
