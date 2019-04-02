#include <iostream>

using namespace std;

int main()
{
	int first, second;
	int * pointer;
	
	pointer = &first;
	*pointer = 10;
	
	cout << "firstValue" << first << '\n';
	cout << "pointer" << *pointer << '\n';
	
	return 0;
}