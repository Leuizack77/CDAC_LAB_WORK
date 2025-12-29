using System;

namespace _12Demo_SealedClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            MyMath2 myMath2 = new MyMath2();
            myMath2.SayHi();
            Console.WriteLine(myMath2.Square(2));
        }
    }

    public sealed class CMath
    {
        public int Add(int x, int y)
        {
            return x + y;
        }
        public int Sub(int x, int y)
        {
            return x - y;
        }
    }

    public class AdvanceMath
    {
        public virtual int Square(int x)
        {
            return x * x;
        }
    }

    public class MyMath : AdvanceMath
    {
        public virtual void SayHi()
        {
            Console.WriteLine("Hi!");
        }

        public sealed override int Square(int x)
        {
            return x * x * 100;
        }
    }

    public class MyMath2 : MyMath
    {
        public override void SayHi()
        {
            Console.WriteLine("Hello Abhi!");
        }
    }
}
