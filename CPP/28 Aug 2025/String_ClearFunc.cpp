#include <iostream>
#include <string.h>
using namespace std;

void Demo(string str)
{
    str.clear();
    cout << "After clear : ";
    cout << str;
}

int main()
{
    string str("Hello All");
    cout << "Before clear : ";

    cout << str << endl;
    Demo(str);
    return 0;
}