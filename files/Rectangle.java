public class Rectangle extends Super {
    private int x, y;
    private final int  deson;
    private int width, height;
    private String name2;
    public Rectangle(String mdas)
{
  
 super("a");
 deson=12;

}        
//{
// deson=12;
//}
 //   public Rectangle() {
  //      this(0, 0, 1, 1);
  //  }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
    super("aas");       
 this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
  deson=12;
    }
 
}
class Super
{
 String name;

  Super(String n)
{
}


}
