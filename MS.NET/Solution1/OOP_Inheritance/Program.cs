using OOP_Inheritance.Logic;

namespace OOP_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //UI
            #region Demo 01
            Person person = new Person();
            person.first_name = "Abhishek";
            person.last_name = "Alkari";
            Console.WriteLine(person);
            Console.WriteLine("Name : {0} {1}", person.first_name, person.last_name);
            #endregion

            #region Demo 02
            Employee employee = new Employee();
            employee.employee_id = 1000;
            Console.WriteLine("ID = {2}, Name = {0} {1} {2}", person.first_name, person.last_name, employee.employee_id);
            #endregion
        }
    }
}
