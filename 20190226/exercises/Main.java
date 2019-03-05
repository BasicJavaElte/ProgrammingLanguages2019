import java.util.Date;
import java.text.SimpleDateFormat;
import models.DateItinerary;

public class Main
{
    public static void main(String args[]) throws Exception{

        // Constructor with Strings
		DateItinerary d1 = new DateItinerary("20171001", "19900201");
		
		// Empty Constructor
		DateItinerary d2 = new DateItinerary();
		System.out.println(d2);

		// Constructor with dates
		Date current = new Date();
		SimpleDateFormat my_format = new SimpleDateFormat("yyyyMMdd");
		
		
		Date goal = null;		
		goal = my_format.parse("20181111");
		
		DateItinerary d3 = new DateItinerary(current, goal);
		System.out.println(d3);
        
        
    }
}