#include <iostream>

using namespace std;

class Test{
	private:
		int data1;
		float data2;
	
	public:
		void function1()
		{ 
			data1 = 1;
		}
		
		float function2()
		{ 
			data2 = 5.2;
			return data2;			
		}
		
};

int main()
{
	Test test1, test2;
	cout<< test1.function2();
}