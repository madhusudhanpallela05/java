import java.io.*;
import java.lang.*;
class String_comparision_Demo{
    public static void main(String args[]){
        String s1="Sasi";
        String s2="SITE";
        String s3="SASI";
        String s4="SASI";
        String s5="sasi";
        String s6="sasisite";
        System.out.println("S1 equals s2 returns:"+s1.equals(s2));
        System.out.println("S3 equals s5 returns:"+s3.equals(s5));
        System.out.println("S3 equals s5 returns:"+s3.equalsIgnoreCase(s5));
        System.out.println("s1 compare to s2 returns:"+s1.compareTo(s2));
        System.out.println("s3 compare to s5 returns:"+s3.compareTo(s5));
        System.out.println("s5 compare to s6 returns:"+s5.compareTo(s6));
        System.out.println("S1 == S2 returns "+s1==s2);
        System.out.println("S3 == S5 returns "+s3==s5);

    }
}
