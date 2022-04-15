package inheritance;

//Parent class
class Animal{
    void eat(){
        System.out.println("I eat food");
    }
    void walk(){
        System.out.println("I can walk");
    }
    void sleep(){
        System.out.println("I also sleep");
    }
}

//child class 1
class dog extends Animal{
    void bark(){
        System.out.println("I can bark");
    }
}

class german_sephard extends dog{
    void black_white(){
        System.out.println("I have balck and white spots");
    }
    void loud_bark(){
        System.out.println("I bark very loud");
    }
}

class german_sephard_new extends german_sephard{
    void partial_white_brown(){
        System.out.println("I am new german sherperd with brown clour.");
    }
}

public class hybrid_inheritence {
    public static void main(String[] args) {
        german_sephard_new d1 = new german_sephard_new();
        d1.eat();
        d1.walk();
        d1.sleep();
        d1.bark();
        d1.partial_white_brown();
    }
}

/*
OUTPUT
I eat food
I can walk
I also sleep
I can bark
I am new german sherperd with brown clour.

                    Animal
                     |
                    dog
                    / \
      german_sephard   mountain_husky 
             |
    german_sephard_new
*/