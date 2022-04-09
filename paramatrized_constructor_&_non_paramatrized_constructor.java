class school{
	int a;
	String b;
	// non paramatrized constructor
	school(){
		System.out.println("This is a non paramatrized constructor");
	}
	// paramatrized constructor
	school(int num1, String s1){
		this.a = num1;
		this.b = s1;
		System.out.println("This is a paramatrized constructor "+ a + " " + b);
	}
	
}

public class Main {
	public static void main(String[] args) {
		school s1 = new school();
		school s2 = new school(45,"Raj");

	}
}


/*
OUTPUT
This is a non paramatrized constructor
This is a paramatrized constructor 45 Raj


     this would be invoked while an object
     of that class is created.
*/