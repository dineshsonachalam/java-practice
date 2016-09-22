import java.util.StringTokenizer;
class token
{
  public static void main(String[] args) {
    StringTokenizer st= new StringTokenizer("my,name,is,khan");
    while(st.hasMoreElements())
    {
        System.out.println(st.nextToken(","));
    }
  }
}
