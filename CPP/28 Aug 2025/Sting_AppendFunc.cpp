
#include <iostream>
#include <string.h>
using namespace std;

int main() 
{
    string str1("Hello All!\n");
    string str2("Abhishek Alkari");

    str1.append(str2);
    cout << str1 << endl;
    return 0;
}