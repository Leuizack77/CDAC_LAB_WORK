#include <iostream>
using namespace std;

void show()
    {
        static int x = 0;
        cout << x << endl;
        x++;
    }

int main()
{
    show();
    show();
    show();
}