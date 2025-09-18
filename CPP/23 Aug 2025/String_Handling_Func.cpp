#include <iostream>
using namespace std;
#include <string.h>

int main()
{
    char str[50] = "hello world";
    char str1[] = "hello\0 world";

    int len = strlen(str);
    cout << "Length of String is: " << len << endl;
    cout << "Size of String is: " << sizeof(str) << endl;
    
    cout << str << endl;
    cout << str1 << endl;
    
    cout << sizeof(str1) << endl;
    cout << strlen(str1) << endl;
}