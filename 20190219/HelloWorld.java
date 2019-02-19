public class HelloWorld{
	
	// Simple method non-static that returns int 1
	public int getInt(int number){
		return number+1;
	}
	
	// takes an Integer and returns its double	
	public static int getDoubleOfInt(int number){
		return number*2;
	}


	// create a method called stringToInt that 
	//   takes a String as argument and returns its int conversion
	public static int stringToInt(String myStringArgument){
		return Integer.parseInt(myStringArgument);
	}
	
	
	//Main Method w/ helloWorld	
	public static void main (String args []){
		// Starting an int 
		int myArgument;
				
		// Instantiating a new classroom using the empty constructor
		Classroom ourClassroom = new Classroom();
		
		// Calling the getter from Classroom
		System.out.println(ourClassroom.getNumberOfStudents());
		
		// Calling my static method that transforms a String into Int
		myArgument = stringToInt(args[0]);
		
		// Calling my static method that returns the double of an int
		System.out.println(getDoubleOfInt(myArgument));
		
		System.out.println("Hello World");				
	}
}