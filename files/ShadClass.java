public class ShadClass extends Sub
{

  public static void main(String args[])
{

  ShadClass c1=new ShadClass();
System.out.println(c1.d) ;

}

}

class Base
{
int d=12;

}
class Sub extends Base
{
private int d=12;

}
