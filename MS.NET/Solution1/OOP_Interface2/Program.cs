namespace OOP_Interface2
{
    //System.out.println("Hello World!");
    // S.O.L.I.D Princliples 
    // Interfaces are for:
    // 1. Achieving Abstraction
    // 2. Achieving Multiple Inheritance
    // 3. Loose Coupling
    // 4. Open Contracts
    // 5. Templated Programming
    // 6. No need for Type casting
    // Factory Design Pattern : Object creation logic is separated from the main program logic.
    internal class Program
    {
        static void Main(string[] args)
        {
            //UI generation
            #region Demo 01
            //InsertInMySqlServer();
            //UpdateInMySqlServer();
            //DeleteInMySqlServer();
            //MySqlServer mysql = new MySqlServer();
            //mysql.Insert();
            //mysql.Update();
            //mysql.Delete(); 
            #endregion

            Console.WriteLine("Enter your Database choice. " +
                                                        "1. Microsoft Sql Server, " +
                                                        "2. PostGre Sql Server," +
                                                        "3. Oracle Database Server");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DataBaseFactory factory = new DataBaseFactory();
            IDatabase someDatabaseObject = factory.GetSomeDatabase(dbChoice);
            Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
            int opChoice = Convert.ToInt32(Console.ReadLine());
            switch (opChoice)
            {
                case 1:
                    someDatabaseObject.Insert();
                    break;
                case 2:
                    someDatabaseObject.Update();
                    break;
                case 3:
                    someDatabaseObject.Delete();
                    break;
                default:
                    Console.WriteLine("Invalid Database Operation Choice");
                    break;
            }

        }

    }
    public interface IDatabase
    {
        void Insert();
        void Update();
        void Delete();
    }
    public class DataBaseFactory
    {
        // Factory is a design pattern: any module which produces other entity objects.
        public IDatabase GetSomeDatabase(int dbChoice)
        {
            IDatabase db = null;
            switch (dbChoice)
            {
                case 1:
                    db = new SqlServer();
                    break;
                case 2:
                    db = new MySqlServer();
                    break;
                case 3:
                    db = new OracleServer();
                    break;
                default:
                    db = null;
                    break;
            }
            return db;
        }
    }
    public class MySqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in MySql Successfully");
        }
        public void Update()
        {
            Console.WriteLine("Record Updated in MySql Successfully");
        }
        public void Delete()
        {
            Console.WriteLine("Record Deleted from MySql Successfully");
        }
    }
    public class SqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in SqlServer Successfully");
        }
        public void Update()
        {
            Console.WriteLine("Record Updated in SqlServer Successfully");
        }
        public void Delete()
        {
            Console.WriteLine("Record Deleted from SqlServer Successfully");
        }
    }

    public class OracleServer : IDatabase
    {
        public void Delete()
        {
            Console.WriteLine("Record Deleted from OracleServer Successfully");
        }

        public void Insert()
        {
            Console.WriteLine("Record Inserted from OracleServer Successfully");
        }

        public void Update()
        {
            Console.WriteLine("Record Updated from OracleServer Successfully");
        }
    }
}