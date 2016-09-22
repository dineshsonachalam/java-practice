class demo
{
  int rno;
  String s,c;
  demo(int rno,String s,String c)
  {
    this.rno=rno;
    this.s=s;
    this.c=c;
  }
  public String toString()
  {
      //overriding toString() method
      return rno+" "+s+" "+c;
  }

public static void main(String[] args) {
  demo s1= new demo(101,"dinesh","Avadi");
  System.out.println(s1);
}
}
