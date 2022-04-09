class square{
	int do_square(int a){
		return a*a;
	}
}

class circle{
	int radius;
	square s1=new square();
	double pi = 3.14;
	double area(int a){
		int r_square = s1.do_square(a);
		return pi*r_square;
	}
	
}

public class Main {
	public static void main(String[] args) {
		double area_circle;
		circle c1 = new circle();
		area_circle = c1.area(4);
		System.out.println(area_circle);
	}
}

/*
	OUTPUT 
	50.24
	
	Idea - we are implementing Agreesion HAS-A relationship.
	circle HAS A area.
	
	doing nothing -> making two classes , class A, class B making class b objects in class A.
	you can see I have maked a object of square class in circle class and used the method of square class in the method of circle class. 
*/