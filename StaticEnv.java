public class StaticEnv extends M
{

public static void main(String args[])
{
  System.out.println("aaa");
  new StaticEnv();

}

}
class M
{
{
System.out.println("instance parent");
}

static {
System.out.println("static parent");
}
}
