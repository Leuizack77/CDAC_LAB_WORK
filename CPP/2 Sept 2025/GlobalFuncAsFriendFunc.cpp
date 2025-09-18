// #include <iostream>
// using namespace std;

// class base
// {
// private:
//     int private_variable;

// protected:
//     int protected_variable;

// public:
//     base()
//     {
//         private_variable = 10;
//         protected_variable = 99;
//     }

//     friend void friendFunction(base&);
// };

// void friendFunction(base& obj)
// {
//     cout << "Private Variable: " << obj.private_variable
//          << endl;
//     cout << "Protected Variable: " << obj.protected_variable;
// };

// int main()
// {
//     base object1;
//     friendFunction(object1);

//     return 0;
// }

// #include <iostream>
// using namespace std;

// class Box
// {
// private:
//     int length;

// public:
//     Box()
//     {
//         length = 5;
//     }
//     friend int printLength(Box);
// };

// int printLength(Box b)
// {
//     b.length += 10;
//     return b.length;
// };

// int main()
// {
//     Box b;
//     cout << "Length of box: " << printLength(b) << endl;
//     return 0;
// }

#include <iostream>
using namespace std;
class complex
{
    int real, img;

public:
    complex();
    complex(int, int);
    void display();
    complex operator+(int);
    friend complex operator+(int, complex &);
};

complex::complex()
{
}

complex::complex(int real, int img)
{
    this->real = real;
    this->img = img;
}

void complex::display()
{
    if (img > 0)
        cout << "complex number is " << real << "+" << img << "i" << endl;
    else
        cout << "complex number is " << real << img << "i" << endl;
}

complex complex::operator+(int num)
{
    complex temp;
    temp.real = real + num;
    temp.img = img + num;
    return temp;
}

complex operator+(int num, complex &c)
{
    complex temp;
    temp.real = c.real + num;
    temp.img = c.img + num;
    return temp;
}

int main()
{
    /*complex c1(1,2);
    complex c2=c1 + 5;//c2=c1.operator+(5)
    c2.display();*/
    complex c1(1, 2);
    complex c2 = 5 + c1; //  operator+(5,c1)
    c2.display();
}
