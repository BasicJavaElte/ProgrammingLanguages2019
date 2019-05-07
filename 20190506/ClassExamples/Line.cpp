#include <iostream>

using namespace std;

class Line{
	public:
		int getLegth(void);
		Line( int len );
		Line( const Line &obj); // Copy Constructor
		~Line();
	
	private:
		int *ptr;
};

// Member functions
Line::Line(int len){
	cout << "I'm calling the normal constructor here" << endl;
	
	ptr = new int;
	*ptr = len;
}

Line::Line( const Line &obj){
	cout << "I'm calling my Copy guy" << endl;
	ptr = new int;
	*ptr = *obj.ptr;		
}

Line::~Line(void){
	cout << "Goodbye cruel world" << endl;
	delete ptr;	
}

int Line::getLegth(){
	return *ptr;
}

void display(Line obj){
	cout << "Displaying: "<< obj.getLegth() << endl;
}

int main(){
	Line line1(10);
	
	Line line2 = line1;
	
	display(line1);
	
	return 0;
	
	
}

