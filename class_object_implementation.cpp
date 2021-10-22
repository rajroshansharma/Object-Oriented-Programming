/*Creating a simple class of students and making objects of it */

#include <iostream>
#include <string>
using namespace std;

class student
{
public:          // Access specifier
    int roll_no; // properties
    string name;
    int class_of;
    char section;
};

int main()
{
    student s1;
    s1.roll_no = 89;
    s1.name = "abcd";
    s1.class_of = 5;
    s1.section = 'A';

    /*We can access the properties of an particular objects by Dot operator '.' or by '->' both will
    do the same task*/

    cout << "Information of student 1 :" << endl;
    cout << s1.name << endl
         << s1.roll_no << endl
         << s1.class_of << endl
         << s1.section;

    return 0;
}

/*
output
abcd
89
5
A
*/