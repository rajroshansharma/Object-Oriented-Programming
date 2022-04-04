class shape{
	float area;
	public void render(){
		System.out.println("Rendering shape...");
	}
}

class circle extends shape{
	double area;
	@Override
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

Method overriding -> if the same method is present in both the superclass and the subclass. Then, the method in the subclass overrides the same method in the superclass. This is called method overriding.
*/