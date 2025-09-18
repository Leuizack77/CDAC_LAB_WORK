#include<iostream>
using namespace std;

// class cdate
// {
// 	int dd,mm,yy;
// 	public:
// 		cdate()
// 		{
// 			dd=mm=yy=0;
// 		}
// 		cdate(int d,int m,int y)
// 		{
// 			dd=d;
// 			mm=m;
// 			yy=y;
// 		}
// 		void show()
// 		{
// 			cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
// 		}
// };

// int main()
// {
// 	cdate* ptr=new cdate();
// 	ptr->show();

// 	cdate* ptr1=new cdate(1,3,2025);
// 	ptr1->show();

// }



class Student
{
	int rollno;
	char name[20];
	public:
		void accept()
		{
			cin>>rollno;
			cin>>name;
		}
		void display()
		{
			cout<<"rollno is \t"<<rollno<<"name is \t"<<name<<endl;
			
		}
	
};
  
int main()
  {
  	int n,i;
  	cout<<"enter no of students\n";
  	cin>>n;
  Student* ptr	=new Student[n];
  cout<<"accept details\n";
  for(i=0;i<n;i++)
   ptr[i].accept(); //(ptr+i)->accept();
   cout<<"display details\n";
  for(i=0;i<n;i++)
   (ptr+i)->display();//ptr[i].display();

}

