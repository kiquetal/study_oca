public class compareWrapper
{
  
public static void main(String args[])
{
int i1=0;
i1+=1;
Integer i2=new Integer(i1);
System.out.println(i1==i2);

double f= new Float(12.0f);
int d1=12;

if (f==d1)
{
System.out.println("iguales");
}
else
{
 System.out.println("diferentes");
}

}

}
