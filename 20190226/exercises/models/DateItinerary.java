package models;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateItinerary{
	
	private Date current;
	private Date goal;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

	
	//DateItinerary(String, String)
	public DateItinerary(String current, String goal) throws Exception{
		this.current = sdf.parse(current);
		this.goal = sdf.parse(goal);
	}
	
	//DateItinerary()
	public DateItinerary(){}
	
	//DateItinerary(Date, Date)
	public DateItinerary(Date current, Date goal){
		this.current = current;
		this.goal = goal;
	}
	
	public boolean isInTheFuture(){		
		return current.before(goal);
	}
	
	public boolean isInThePast(){
		return current.after(goal);	
	}
	
	public Date getCurrent(){
		return current; //this.current
	}
	
	public void setCurrent(Date current){
		this.current = current;
	}
	
	public Date getGoal(){
		return goal;
	}
	
	public void setGoal(Date goal){
		this.goal = goal;
	}
}