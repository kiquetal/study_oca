public class BuilderString
{


 public static void main(String args[])
{

  StringBuilder sb=new StringBuilder("0124");
  sb.replace(1,3,"AAAAA");
  System.out.println(sb);

}


}
