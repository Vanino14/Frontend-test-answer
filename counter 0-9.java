/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hitung
{
public static void main(String args[])   
{  
String str;  
int i, len;  
int counter[] = new int[256];  
Scanner scanner = new Scanner(System.in);  
System.out.println("Please enter the number ");  
str = scanner.nextLine();  
len = str.length();  
for (i = 0; i < len; i++)   
{  
counter[(int) str.charAt(i)]++;  
}  
for (i = 48; i < 58; i++)   
{      
System.out.println("The number "+(char) i + " Appears For  " + counter[i]+ " Times"); 
}
}}
