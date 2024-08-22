import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class FormatedOutput2
{
    public static void main(String args[])
    {
        double x=123.45678;
        DecimalFormat DF=new DecimalFormat("####");
        System.out.println("\n With the fractional part the  no is:"+x);
        System.out.println("\n Without the fractional part the  no is:"+DF.format(x));
        DF=new DecimalFormat("#.##");
        System.out.println("\n Formatted no with precision is :"+DF.format(x));
        DF=new DecimalFormat("$####,###,##");
        System.out.println("\n  after Formatting the value is :"+DF.format(x));
    }
}
