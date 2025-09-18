#include <iostream>
using namespace std;

int main()
{
    int a = 10, b = 20;
    swap(a,b);

    cout << "Values" << "a=" << a << "\t" << "b=" << b << endl;
}

void swap(int &p, int &q)
{
    int temp = p;
    p = q;
    q = temp;
    cout << "Values" << "p=" << p << "\t" << "q=" << q << endl;
}