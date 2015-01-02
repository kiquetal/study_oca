 enum Enum
{
PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");
 
	private String statusCode;
        private final String donde; 
	private Enum(String s) {
		statusCode = s;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
 }
public class EnumPrueba
{
 public static void main(String args[])
{

 System.out.println(Enum.ACTIVE.getStatusCode());
}

}
