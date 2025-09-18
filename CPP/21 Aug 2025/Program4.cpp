#include<iostream>
using namespace std;

int main()
{
    int a[5];
    for (int i=0;i<=4;i++)
    {
        cout << "Enter The Elements:\n";
        cin >> *(a+i);
    }

    for (int i=0;i<=4;i++)
    {
        cout << "Elements are:\n" << *(a+i) << endl;    
    }

}