public class MyMain{
	
	public static void main (String[] args){
		MyInts myInts = new MyInts();
		
		myInts.setNewNumber(10);
		myInts.setNewNumber(234);
		myInts.setNewNumber(234);
		myInts.setNewNumber(10);
		myInts.setNewNumber(234);
		myInts.setNewNumber(3);
		myInts.setNewNumber(7);
		
		myInts.mySort();
		System.out.println(myInts);
		
	}
}