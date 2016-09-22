class stringReplace
{
  public static void main(String[] args) {

      String org="This is a test. This is too!";
      String search="is";
      String sub="was";
      String result=" ";
      int i;
      do {
          //replacing all matching substring
          System.out.println(org);
          i=org.indexOf(search);
          System.out.println("Index of i:"+i);//2
          if(i!=-1)
          {
              result=org.substring(0,i); //substring(int startIndex,int endIndex)
              System.out.println("Result:"+result);//Th
              result=result+sub;//Thwas
              System.out.println("Result:"+result);
              String display = org.substring(i+search.length());
              System.out.println("display:"+display);
              result=result+org.substring(i+search.length());
              System.out.println("Result:"+result);
              org=result;
              System.out.println();
              System.out.println();
              System.out.println();
          }
      } while (i!=-1);
      }
}
