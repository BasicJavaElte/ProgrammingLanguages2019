import java.util.Date;
import java.text.SimpleDateFormat;

public class DateThing{
	
	public static void main (String [] args) throws Exception{
		Date myDate;
		SimpleDateFormat myFormat 
			= new SimpleDateFormat("yyyy/MM/dd");
		
		// parse = Parses text from a string to produce a Date
		// format = Formats the given Date into a date/time string
		
		myDate = myFormat.parse("2015/02/16");
		
		
		System.out.println(myDate);
		
		Date d1;
		Date d2;
		
		d1.before(d2);
	}
	
}