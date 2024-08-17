import java.io.*;
public class Formatted_output1
{
public static void main(String args[])
{
String str="MadhuSudhan";
System.out.printf("The String value is:%s\n",str);
int x=512;
System.out.printf("The integer value is:%d\n",x);
double f=5.25412368;
System.out.printf("\nThe decimal value is:%f\n",f);
System.out.printf("After formatting to specific width the value :%.4f\n",f);
System.out.printf("After formatting to right margine the value: %20.4f\n",f);
}
}
