/*
Loose Coupling in Java
The more loosely coupled structures present in the project or program, the better it is. In loose coupling, a method or class is almost independent, and they have less depended on each other. In other words, the more knowledge one class or method has about another class or method, the more tightly coupled structure is developed. If the classes or methods know less about each other, the more loosely coupled structure comes into existence.

Abstraction is the Key
To achieve loose coupling, one should use abstract classes or interface while performing inheritance. The following examples will make the concept
*/

interface Parent  
{  
    void foo();  
}  
  
class A implements Parent  
{  
    // parameterized constructor  
    A(int x, int y)  
    {  
          
    }  
      
    public void foo()  
    {  
        System.out.println("In the foo method of class A.");  
    }  
}  
  
class B implements Parent  
{  
    public void foo()  
    {  
        System.out.println("In the foo method of class B.");  
    }  
}  
  
public class Main  
{  
  
// main method   
public static void main(String argvs[])   
{  
// creating an object of class B  
B obj = new B();  
obj.foo();  
}  
}  
