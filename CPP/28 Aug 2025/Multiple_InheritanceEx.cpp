#include <iostream>
using namespace std;

class ABC
{
    public:
        void displayFirst() 
        {
            cout << "This is ABC class." << endl;
        }
};

class LMN
{
    public:
        void displaySecond() 
        {
            cout << "This is LMN class." << endl;
        }
};

class Derived : public ABC, public LMN
{
    public:
        void displayDerived() 
        {
            cout << "This is Derived (PQR) class." << endl;
        }
};

int main() 
{
    Derived obj;
    obj.displayFirst();
    obj.displaySecond();
    obj.displayDerived();

    return 0;
}
