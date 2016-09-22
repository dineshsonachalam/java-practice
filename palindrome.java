import java.io.*;
import java.util.*;
class pal
{
  public static void main(String[] args) {
    //to find palindrome of a string

  Scanner scan=new Scanner(System.in);
  //  String a= scan.next();
    StringBuffer a = new StringBuffer();
    a.append(scan.nextLine());
    StringBuffer s = new StringBuffer(a);
    s.reverse();
    if(s.equals(a))
    {
    System.out.println(s+" ");
    System.out.println("The give string is a palindrome");
    }
    else
    {
      System.out.println("Not a palindrome");
    }
  }
}
