#include <iostream>
#include <string>
using namespace std;

int main() 
{
    string str = "Hello, All!";
    str.erase(5, 7);

    cout << "After erase: " << str <<endl;
    return 0;
}
