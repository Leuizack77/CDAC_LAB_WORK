#include <iostream>
#include <string.h>
using namespace std;

int main() 
{
    string str1 = "Abhishek";
    string str2 = "Alkari";

    int result = str1.compare(str2);

    if(result == 0) 
    {
        cout << "The strings are equal." << endl;
    }
    
    else if(result<0) 
    {
        cout << "str1 is smaller than str2." << endl;
    } 
    
    else 
    {
        cout << "str1 is greater than str2." << endl;
    }

    return 0;
}
