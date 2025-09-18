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
  
class ProtectedDerived : protected Base { 
public: 
    int getProt() { return prot; } 
    int getPub() { return pub; } 
}; 
  
int main() 
{ 
    ProtectedDerived object1; 
    cout << "Private cannot be accessed." << endl; 
    cout << "Protected = " << object1.getProt() << endl; 
    cout << "Public = " << object1.getPub() << endl; 
// cout<<object1.prot;//error
// cout<<object1.pub;//error
// cout<<object1.getPvt();//error
    return 0; 
}
