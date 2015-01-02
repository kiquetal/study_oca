class Protectedi
{
  protected void algo()
{
System.out.println("soy protected");
}


}

class Mn extends Protectedi
{

 public static void main(String args[])
{

  Protectedi p=new Protectedi();
   p.algo();

}
  

}
