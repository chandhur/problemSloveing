import java.util.Calendar;
import java.text.SimpleDateFormat;

public class date 
{
	
public static void main(String args[])
{
		
  String date = new SimpleDateFormat("yyyy_MM_DD").format(Calendar.getInstance().getTime());
System.out.println(date);
   
		
		
}
	
	
	
	
	
	
}