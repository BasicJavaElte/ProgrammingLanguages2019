
public class Doggo extends Pet{
	public String colors;
	
	public Doggo(String colors, String name, int yearOfBirth){
		super(name,yearOfBirth);
		this.colors = colors;
			
	}
	
	@Override
	public String toString(){
		return "This is a "+colors+" DOGGO" +
		super.toString();
	}
}