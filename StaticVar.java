public class StaticVar implements Point
{
static  int d=4;
//final int m;

// {
//this.d=12;
//}

  StaticVar()
{

d=12;
}

public static void main (String [] args)
{
 System.out.println(new StaticVar().d);
  byte d=12;
  byte  m=12;
int m1=0;
m1+=12+2.3;
System.out.println(m1);
}
public void algo()
{
}
 void calcular()
{} 

}
interface Point
{
 int d=12;
 
 void algo();
// abstract void calcular();
}
interface Point2
{

int d=32;
}
