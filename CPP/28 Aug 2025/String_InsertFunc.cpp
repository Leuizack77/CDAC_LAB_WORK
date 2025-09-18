#include <iostream>
#include <string>
using namespace std;

int main() 
{
    string str = "Hello Morning";
    string to_insert = "Good ";

    str.insert(6, to_insert);

    cout << str;
    return 0;
}