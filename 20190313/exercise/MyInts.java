import java.util.ArrayList;

	/*
		Implement a dynamically resizing ArrayList class 
		storing int values in an array; 		
		set new number
		order numbers
		delete number
		toString
	*/

public class MyInts{
	
	ArrayList<Integer> myIntegers;

	public MyInts(){
		this.myIntegers = new ArrayList<Integer>();
	}
	
	public void setNewNumber(int i){	
		Integer j = new Integer(i);
		myIntegers.add(j);
	}
	
	
	public void mySort(){
		for(int i=0; i<myIntegers.size(); i++){
			for(int j=0; j<myIntegers.size();j++){
				
				Integer n1 = myIntegers.get(i);
				Integer n2 = myIntegers.get(j);
				
				if(n1.compareTo(n2)<0){
					Integer aux = myIntegers.get(i);
					myIntegers.set(i, myIntegers.get(j));
					myIntegers.set(j, aux);
				}
				
			}
			
		}
		
	}
	
	@Override
	public String toString(){
		String response = "";
		
		//for (int i=0; i<myIntegers.size(); i++)
			//Integer j = myIntegers.get(i);
		
		for(Integer j: myIntegers){
			response += j + " ";
		}
		
		return response;
	}
	
	
	
	
	
}