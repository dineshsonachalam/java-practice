//learn regular expressions from regexr.com
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class myRegex
{
        Pattern p = Pattern.compile("\d{1,10}\b");
        Matcher m= p.matcher()
}
class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}
