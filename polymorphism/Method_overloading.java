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
	
	public void render(int n){
		System.out.println("Rendering circle " +n+ " times.");
	}
	
	public void render(String name){
		System.out.println(name+" are you kidding with me!");
	}
	public void render(int a, double b){
		System.out.println(a+" and "+b);
	}
}

class Main{
	public static void main(String[] args){
		
		shape s1 = new shape();
		s1.render();
		
		circle c1 = new circle();
		c1.render();
		c1.render(5);
		c1.render("sova");
		c1.render(5,8.9);
	}
}

/*
OUTPUT
Rendering shape...
Rendering circle...
Rendering circle 5 times.
sova are you kidding with me!
5 and 8.9


Method overloading -> In a Java class, we can create methods with the same name if they differ in parameters. 
*/