#include <iostream> 
using namespace std; 
  
// int main() 
// { 
  
//     typedef int arr[3];   
//     arr array1{ 1 , 1, 1}; 
//     cout << "Array output: " << "\n"; 
    
//     for (int i = 0; i < 3; i++) 
//     { 
//         cout << array1[i] << " "; 
//     } 
//     cout << "\n"; 

// }


int main() 
{ 
    int a = 10; 
    int b = 20; 
    // iPtr can now be used to create new pointers of type 
    // int 
    typedef int* iPtr; 
  
    iPtr pointer_to_a = &a; 
    iPtr pointer_to_b = &b; 
  
    cout << "a is : " << *pointer_to_a << "\n"; 
    cout << "b is : " << *pointer_to_b << "\n"; 
  
    return 0; 
}