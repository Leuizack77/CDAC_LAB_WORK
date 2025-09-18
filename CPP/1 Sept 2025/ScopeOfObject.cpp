#include <iostream>
using namespace std;

class Test
{
	public:
	Test()
	{
		cout<<"constructor is invoked\n";
	}
	~Test()
	{
		cout<<"destructor is invoked\n";
	}
};

Test t1;

int main()
{
	cout<<"main begins";
	Test t2;
	{
		cout<<"block begins\n"<<endl;
		Test t3;
		cout<<"block ends\n"<<endl;
	}
	cout<<"main ends\n"<<endl;
}

