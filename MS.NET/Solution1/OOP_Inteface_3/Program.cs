namespace _9Demo_OOP_Interface
{
 
    internal class Program
    {
        static void Main(string[] args)
        {
            
            #region Demo 01
            //InsertInMySqlServer();
            //UpdateInMySqlServer();
            //DeleteInMySqlServer();
            //MySqlServer mysql = new MySqlServer();
            //mysql.Insert();
            //mysql.Update();
            //mysql.Delete(); 
            #endregion

            Console.WriteLine("Enter Your Database Choice. 1. MySQL Server, 2.  PostGreSQL Server, 3. Oracle Server");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DataBaseFactory factory = new DataBaseFactory();
            IDatabase someDatabaseObject = factory.GetSomeDatabase(dbChoice);
            Console.WriteLine("Enter DataBase Operation Choice : 1. Insert, 2. Update, 3. Delete");
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
                    Console.WriteLine("Entered Invalid Database operation Choice");
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
                    db = new MySqlServer();
                    break;
                case 2:
                    db = new PostGreSQLServer();
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
            Console.WriteLine("Record Inserted in MySQL Successfully");
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
    public class PostGreSQLServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in PostGreSQLServer Successfully");
        }
        public void Update()
        {
            Console.WriteLine("Record Updated in PostGreSQLServer Successfully");
        }
        public void Delete()
        {
            Console.WriteLine("Record Deleted from PostGreSQLServer Successfully");
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