public class Classroom{
	private int numberOfStudents;
	
	//Constructors
	//Empty Constructor
	public Classroom(){
		numberOfStudents = 0;
	}
	
	//Contructor with arguments
	public Classroom(int numberOfStudents){
		this.numberOfStudents = numberOfStudents;
	}
	
	// getters and setters
	public void setNumberOfStudents(int numberOfStudents){
		this.numberOfStudents = numberOfStudents;		
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
}