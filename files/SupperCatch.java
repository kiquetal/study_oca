import java.io.*;
public class SupperCatch extends That

{

int d=12;
public static void main(String args[]) throws IOException

{
 That cs=new SupperCatch();
  cs.contar();
System.out.println("esto es"+cs.d);
}
  

public void contar()
{
 System.out.println("contamo ");
}


}
class That
{
int d=22;
 
public void contar() throws IOException {
//    throw new IOException("your message");
System.out.println("aaaa");
}




}
