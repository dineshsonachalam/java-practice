//simple regex first program
import java.util.regex.*;
class regex
{
  public static void main(String[] args) {
    //1st way
    Pattern p=Pattern.compile(".s"); //represents single character
    Matcher m=p.matcher("as");
    boolean b=m.matches();
    //2nd way
    boolean b2=Pattern.compile(".s").matcher("as").matches();
    //3rd way
    boolean b3 =Pattern.matches(".s","as");

    System.out.println(Pattern.matches("..s","mas"));


    System.out.println(b+" "+b2+" "+b3);
    System.out.println("?quantifier ...");

    System.out.println(Pattern.matches("[amn]?+","abcd")); //false not a or m or n
    System.out.println(Pattern.matches("[amn]*","a")); //true
  //  System.out.println(Pattern.matches("[amn]","ammna")); // m and a occurs more than once so false
  }
}
