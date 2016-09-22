import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        int k=scan.nextInt();
        int r=k;
        String[] a=new String[1000];
        for(int i=0;i<a.length();i++)
        {
          a[i]= s.substring(i,r);
        //  System.out.println("A:"+a[i]);
          r=r+1;
        }
        //finding the largest according to the lexical order
        for(int i=0;i<s.length();i++)
        {
          if(a[i].compareTo(a[i+1])>0)
          {
            a[i]=a[i+1];
          }
        }
        System.out.println(a[0]+" "+a[a.length()-1]);

    }
}
