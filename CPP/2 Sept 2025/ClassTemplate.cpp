#include <iostream>  
using namespace std; 

// template<class T>  
// class A   
// {  
//         public:  
//             T num1;  
//             T num2;  
//             A(T x) 
//             {
//                 num1 = x;
//                 num2 = x;
//             }          
//             void add()  
//             {  
//                 cout << "Addition of num1 and num2 : " << num1 + num2 <<endl;  
//             }  
// };  
  
// int main()  
// {  
//     A<int> d(5);  
//     d.add();  
//     return 0;  
// } 


// #include <iostream>  
// using namespace std;  

// template<class T>  
// class A   
// {  
//     public:  
//         T num1;  
//         T num2;  
//         A(T x,T y) 
//         {
//             num1 = x;
//             num2 = y;
//         }          
//         void add()  
//         {  
//             cout << "Addition of num1 and num2 : " << num1 + num2 << endl;  
//         }  
      
// };  
  
// int main()  
// {  
//     A<int> d(2,3);  
//     d.add();  
//     return 0;  
// } 

#include <iostream>  
using namespace std;

template<class T>
class A   
    {  
	    public:
        T a, b;  
        
        public:  
        void display(T a,T b)
        {  
            cout << "Values of a and b are : " << a << " ," << b << endl;  
        }  
	};

    int main()  
    {  
        A<int> d;  
        d.display(1,2);  
		A<char> d1;  
        d1.display('a','b');
        return 0;  
    } 





