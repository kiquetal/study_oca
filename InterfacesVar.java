class InterfacesVar
{

 final static int d=dame();
 static int dame()
{
return 45;
}

public static void main(String args[])
{
InterfacesVar v=new InterfacesVar();
v.sumar(4.2f,6);

}
// static
//{
//
//d=12;
//}


public void sumar(float d,float m)
{

System.out.println("sumar");
}
public void sumar(float m,int l)
{
System.out.println("intsumar");
}

}
