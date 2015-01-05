public class aa
{


 public static void main(String args[])
{

String m[][]=null;
aa qm=new aa();
try
{

  System.out.println(m[1][qm.m()]);

}

catch(Exception ex)
{
  ex.printStackTrace();

}

}
static int m() throws Exception

{

 throw new Exception("Error");
}


}
