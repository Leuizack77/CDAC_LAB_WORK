namespace OOP_Inheritance_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Demo 00
            BaseClass baseObj = new BaseClass();
            baseObj.Method1();

            DerivedClass derivedObj1 = new DerivedClass();
            derivedObj1.Method1();
            derivedObj1.Method2();

            BaseClass obj = new DerivedClass();
            obj.Method1();
            #endregion

            DerivedClass derivedObj2 = new DerivedClass(1212);

            #region Method Overloading
            AdvancedMath advMath1 = new AdvancedMath();
            Console.WriteLine(advMath1.Add(1, 2, 3, 4));
            advMath1.Sub(10, 5);
            #endregion

            #region override, new , virtual
            AdvancedMath advMath2 = new AdvancedMath();
            advMath2.Sub(10, 5);
            advMath2.Mult(10, 5);
            advMath2.Add(10, 5);
            #endregion
        }
    }
}
