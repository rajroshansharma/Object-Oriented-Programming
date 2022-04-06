package project_one;

class this_keyword{
    int a;
    int b;
    int c;

    this_keyword(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(this.a + " " + this.b + " " + this.c);
    }

    public static void main(String[] args) {
        this_keyword t1 = new this_keyword(1, 2, 3);
        this_keyword t2 = new this_keyword(4, 5, 6);
        this_keyword t3 = new this_keyword(7, 8, 9);
    }
}

/*
OUTPUT 
1 2 3
4 5 6
7 8 9
we know that a constructor is automaticaly executed when the object is created.
we use this when we are not assogning the class variable at another class or method.
we are passing the object and the variables are assigned to that particular vriable.
like at once only one object can visit the class so, 
example what we do ->  t1.a = 1, t1.b =2 , t1.c = 3
    what system do -> this.a =1, this.b = 2, this.c =3

it is atually assigning and accesing the objects by this keyword and according to out expression
we are assigning the object's variable 
exaple this.a = a
here a before = is the actual variale of that class
here a after =  is the actual value for that variable which is passed throught the parameters. 
*/