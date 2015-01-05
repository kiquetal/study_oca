public class UpCast extends Parent
{

static String print(){System.out.println("soy el child"); return "child";}

public static void main (String args[])
{
UpCast c=new UpCast();
System.out.println("aa"+ ((Parent) c).print());
}


}
class Parent
{


static String print()
{
System.out.println("soy el parent");
return "parent";
}

}
