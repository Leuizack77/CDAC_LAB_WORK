#include <iostream>  
using namespace std;  

 class Account {  
    
   float bonus = 2000;  
    public:
    int getBonus() 
    {
            return bonus;
    }
};  
   class Programmer: public Account {  
   public:  
   float monthly_salary = 5000;  

   void CalculateSalary()
   {
       cout<<"Total Salary: "<<monthly_salary+getBonus();  
   }
   };       
int main() {  
    Programmer p1;  
    cout<<"Total Salary: "<<p1.monthly_salary+p1.getBonus();  
    return 0;  
}  
