public class Widening
{


public static void main(String argsp[])
{

 float i=12;
//INMUTABLE WRAPPERS! OJO!
Integer ds=new Integer(12);
Integer dt=ds;
ds++;
System.out.println("ds" + ds + "dt" + dt);
setSuma(i);
}

static void setSuma(double d)
{
 System.out.println("el doble es "+d);
}
}
