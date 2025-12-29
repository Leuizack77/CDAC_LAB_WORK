namespace OOP_Basics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region FULLY QUALIFIED NAME
            //System.Int32 x = 100;
            //System.Int32 y = 200;
            
            //Int32 x = 100;
            //Int32 y = 200;

            //int x = 100;
            //int y = 200;
            //Console.WriteLine(x + y);
            //Console.WriteLine(x - y);
            #endregion

            //One.MyClass obj = new One.MyClass();
            MyClass obj = new MyClass();
            obj.sayHello();
        }
    }
}
