#include<iostream>
using namespace std;

class Complex{
    int real , img;
    public:
    void accept();
     void display();
     void setReal(int);
     int getReal();
};

void Complex::accept(){
    cout<<"Enter the real and img number\n";
    cin>>real>>img;
}

void Complex::display(){
    cout<<"Complex Number is\n"<<real<< "+"<<img<<"i\n";
}
void Complex::setReal(int r){
    real = r;
}
int Complex::getReal(){
    cout<<"Real number is\n"<<real;
}

int main(){
    Complex c1;
    c1.accept();
    c1.display();
    c1.setReal(99);
    c1.display();
}