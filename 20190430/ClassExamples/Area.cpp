#include <iostream>

using namespace std;

class Area
{
	private:
		int length;
		int breadth;
	
	public:
		
		// Empty Constructor
		Area(): length(5), breadth(2){}
		
		// Constructor with arguments
		Area(int a, int b): length(a), breadth(b){}
		
		void GetLength()
		{
			cout << "Enter the length and breadth respectively ";
			cin >> length >> breadth;
			
		}
		
		void DisplayArea()
		{
			cout << length*breadth << endl;
		}
};

int main()
{
	Area A1, A2(1,2);	
	
	A1.GetLength();
	
	A1.DisplayArea();
	A2.DisplayArea();
	
}