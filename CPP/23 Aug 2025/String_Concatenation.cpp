#include <iostream>
using namespace std;
#include <string.h>

int main()
{
    char str1[20] = "hello";
    char str2[50] = "bye";

    strcat(str1, str2);
    cout << str1;
}