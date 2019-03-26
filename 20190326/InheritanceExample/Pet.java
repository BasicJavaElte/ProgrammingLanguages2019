import java.util.Calendar;

public abstract class Pet{
	private String name;
	private int yearOfBirth;
	
	public Pet(String name, int yearOfBirth){
		this.name = name;
		this.yearOfBirth = yearOfBirth;		
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year - this.yearOfBirth;
	}
	
	@Override
	public String toString(){
		return "name: "+this.name+
				"age: "+this.getAge();
	}
}