#include <iostream>
using namespace std;

class Cdate{
    int dd,mm,yy;
    public:
    void accept();
    void display();
    void setDd(int);
    int getmm();
};

void Cdate :: accept()
{
    cout << "Enter Date " << endl;
    cin >> dd >> mm >> yy;
}

void Cdate :: display()
{
    cout << dd<< "/" << mm <<"/" << yy << endl;    
}

void Cdate :: setDd(int d)
{
    dd=d;
}

int Cdate :: getmm()
{
    return mm;
}

int main()
{
    Cdate d1;

    d1.accept();
    
    d1.setDd(22);
    d1.getmm();
    d1.display();
}
