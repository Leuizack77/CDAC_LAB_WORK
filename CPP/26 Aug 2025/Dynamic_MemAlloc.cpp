#include <iostream>
using namespace std;

// int main() 
// {

//         int* pointInt;

//     float* pointFloat;

//     pointInt = new int;
//     pointFloat = new float;

//     *pointInt = 45;
//     *pointFloat = 45.45f;
//     cout << *pointInt << endl;
//     cout << *pointFloat << endl;

//     int *p = new int(45);  
//     cout<<*p;

//         delete pointInt;
//         delete pointFloat;
//         delete p;
// }

int main()
{
	int* ptr=new int(10);
	cout<<*ptr;
	delete  ptr;
	
}