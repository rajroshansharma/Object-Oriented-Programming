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

class mountain_husky extends dog{
    void white(){
        System.out.println("I am only white and belong to a dog class whcih belongs to animal class.");
    }
}


public class herichal_inheritence {
    public static void main(String[] args) {
        mountain_husky d1 = new mountain_husky();
        d1.eat();
        d1.walk();
        d1.sleep();
        d1.bark();
        d1.white();
    }
}


/*
OUTPUT
                    Animal
                     |
                    dog
                    / \
      german_sephard   mountain_husky 

    A   THIS IS ALLOWED
    /\
    B C

    A  B  this is not allowed
     \/
     c
*/