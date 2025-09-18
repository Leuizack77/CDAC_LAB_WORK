#include <iostream> 
using namespace std; 
  
class Base { 
private: 
    int pvt = 5; 
protected: 
    int prot = 7; 
  
public: 
    int pub = 9; 
  
    int getPVT() { return pvt; } 
}; 
  
class PublicDerived : public Base { 
public: 
    int getProt() { return prot; } 
}; 
  
int main() 
{ 
    PublicDerived object1; 
    cout << "Private = " << object1.getPVT() << endl; 
    cout << "Protected = " << object1.getProt() << endl; 
    cout << "Public = " << object1.pub << endl; 
    return 0; 
}
