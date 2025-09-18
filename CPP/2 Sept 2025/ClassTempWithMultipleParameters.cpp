// #include <iostream>
// using namespace std;

// template <class T1, class T2>
// class A
// {
//     T1 a;
//     T2 b;

// public:
//     A(T1 x, T2 y)
//     {
//         a = x;
//         b = y;
//     }
//     void display()
//     {
//         cout << "Values of a and b are : " << a + b << endl;
//     }
// };

// int main()
// {
//     A<int, float> d(5, 6.5);
//     d.display();
//     return 0;
// }

#include <iostream>
using namespace std;
template <class T, class U>

class A
{
public:
    T x;
    U y;
    void add(T x, U y)
    {
        cout << x + y << endl;
    }
};

int main()
{
    A<int, int> a;
    a.add(1, 7);

    A<int, int> b;
    b.add(4, 9);

    return 0;
}
