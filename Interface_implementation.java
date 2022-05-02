// it is a blueprint of a class.it containes static constants and abstract methods.
/*
used to achieve abstraction and multiple inheritance.
reprsent Is-A relationship
Declration
interface <interface name>{
	your code here.
}
*/

interface geometry{
	float pi = 3.14f;
	public void shape_area();
	public void shape_perimeter();
}

class Circle implements geometry{
	int radius;
	Circle(int r){
		this.radius = r;
	}
	public void shape_area(){
		System.out.println("Circle Area is : "+(pi*radius*radius));
	}
	public void shape_perimeter(){
		System.out.println("Circle Perimeter is : "+(2*pi*radius));
	}
}

class Rectangle_and_Square implements geometry{
	int len,bred;
	//parameterizeid constructor
	Rectangle_and_Square(int l, int b){
		this.len = l;
		this.bred = b;
	}
	//shape area method 
	public void shape_area(){
		if(len == bred){
			System.out.println("Square Area is : "+(len*len));
		}
		else{
			System.out.println("Rectangle Area is : "+(len*bred));
		}
	}
	//shape perimeter
	public void shape_perimeter(){
		if(len == bred){
			System.out.println("Square Area is : "+(4*len));
		}
		else{
			System.out.println("Rectangle Perimeter is : "+(2*(len+bred)));
		}
		
	}
}

public class Main {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		c1.shape_area();
		c1.shape_perimeter();
		
		Rectangle_and_Square r1 = new Rectangle_and_Square(5,5);
		r1.shape_area();
		r1.shape_perimeter();
	}
}


/*
OUTPUT
Circle Area is : 78.5
Circle Perimeter is : 31.400002

Circle Area is : 78.5
Circle Perimeter is : 31.400002
Square Area is : 25
Square Area is : 20

Interface is like a protocol, the class which implements it ,they have to follow all the methods and use all the variables
present in the interface class.
if you have declared 5 methods, you have to use all the the 5 methods.
the methods deaclared in the interface is just like a abstract class.
all the methods and variables decalred in the interface class are of static or final by default. 
*/
