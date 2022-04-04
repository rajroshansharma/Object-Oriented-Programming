class shape{
	float area;
	public void render(){
		System.out.println("Rendering shape...");
	}
}

class circle extends shape{
	double area;
	public void render(){
		System.out.println("Rendering circle...");
	}
}

class Main{
	public static void main(String[] args){
		
		shape s1 = new shape();
		s1.render();
		
		circle c1 = new circle();
		c1.render();
	}
}

/*
OUTPUT
Rendering shape
Rendering circle

Polymorphism allows us to create consistent code.
*/