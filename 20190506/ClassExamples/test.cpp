#include <iostream>

using namespace std;

class Box{
	public:
		Box(){
			cout<< "heeeloo wold" << endl;
		}
		~Box(){
			cout<< "Adeus wold" << endl;
		}
	
};

int main(){
	// Empty pointer
	Box* pvalue = new Box[4];	
	delete [] pvalue;
	
	
	
	return 0;
}