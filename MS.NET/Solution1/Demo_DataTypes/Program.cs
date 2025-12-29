namespace Demo_DataTypes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region BASICS OF DATATYPES
            //int x = 42;
            //System.Int32 y = 100;
            //double d = 3.14159;
            //Console.WriteLine("X = {0}, Y = {1} , d = {2}", x,y,d);

            //String str = "Hello Abhishek Alkari";
            //String str2 = "Hello Amol Yenge";
            //String str3 = new string("abc");
            //Console.WriteLine(str);
            //Console.WriteLine(str2);
            //Console.WriteLine(str3);

            //char ch = 'A';
            //char[] chArr = new char[2];
            //chArr[0] = 'H';
            //chArr[1] = 'i';
            //String str4 = new String(chArr);
            //Console.WriteLine(str4);
            #endregion

            #region IF-ELSE
            //bool isRaining = true;
            //if (isRaining)
            //{
            //    Console.WriteLine("Take An Umbrella");
            //} 
            //else
            //{
            //    Console.WriteLine("No Need");
            //}
            #endregion

            #region FOR-LOOP
            //for (int i = 0; i <= 10; i++)
            //{
            //    Console.WriteLine(i);
            //}
            #endregion

            #region DO-WHILE LOOP
            //int x = 10;
            //do
            //{
            //    Console.WriteLine(x);
            //    x--;
            //}
            //while (x > 0);
            #endregion

            #region SWITCH-CASE
            //Console.WriteLine("Enter Your Choice");
            //string input = Console.ReadLine();
            //int choice = Convert.ToInt32(input);

            //switch (choice)
            //{
            //    case 1:
            //        Console.WriteLine("You Selected Option 1");
            //        break;
            //    case 2:
            //        Console.WriteLine("You Selected Option 2");
            //        break;
            //    case 3:
            //        Console.WriteLine("You Selected Option 3");
            //        break;
            //    case 4:
            //        Console.WriteLine("You Selected Option 4");
            //        break;
            //    default:
            //        Console.WriteLine("Invalid Option");
            //        break;
            //}
            #endregion

            #region BOXING
            //int x = 100;
            //string str = "HELLO WORLD!!!";
            //Object obj1 = new Object();

            //obj1 = x;
            //Console.WriteLine(obj1);
            //str = Convert.ToString(x);
            //string str2 = x.ToString();
            #endregion

            #region UN-BOXING
            //int y = Convert.ToInt32(obj1);
            //int p = Convert.ToInt32(str2);
            //Console.WriteLine(" Y = {0}, p = {1}",y ,p);
            #endregion

            #region TYPE-CASTING
            //double d = 7.18;
            //int num1  = Convert.ToInt32(d);

            //double d2 = num1;
            //Console.WriteLine("d = {0}, num1 = {1}, d2 = {2}", d, num1, d2);

            //object obj2 = new object();
            //String str4 = "Something";
            //obj2 = str4;
            //string str5 = obj2.ToString();
            //Console.WriteLine(obj2);
            #endregion

        }
    }
}
