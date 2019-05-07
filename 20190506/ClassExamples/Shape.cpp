#include <iostream>

using namespace std;

class Shape{
	
	protected:
		int width;
		int height;			
		
	public:
		void setWidth (int w){
			width = w;
		}
		void setHeight(int h){
			height = h;
		}				
};

class PaintCost{
	public:
		int getCost(int area){
			return area * 10;
		}
	
};

class Rectangle: public Shape, public PaintCost{
	public:
		int getArea(){
			return (height*width);
		}	
};

int main(){
	Rectangle rect;
	
	rect.setWidth(5);
	rect.setHeight(6);
	
	cout<<"Total Area: " << rect.getArea() << endl;
	
	cout<<"The Cost of painting: " << rect.getCost(rect.getArea()) << endl;
	
	return 0;	
}