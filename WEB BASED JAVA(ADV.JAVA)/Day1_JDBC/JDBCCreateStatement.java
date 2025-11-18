import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class JDBCCreateStatement {

	public static void main(String[] args) {
	
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.117:3306/dac4?useSSL=false";
			conn = DriverManager.getConnection(url, "dac4", "welcome");
			Statement st = conn.createStatement();
			if(conn != null) {
				System.out.println("Connection is Done");
			}else {
				System.out.println("Connection Not Done");
			}
			
			ResultSet rs = st.executeQuery("select * from dept");
			while(rs.next()) {
				System.out.println("DEPT NO : "+rs.getInt(1));
				System.out.println("DEPT NAME: "+rs.getString(2));
				System.out.println("DEPT LOC: "+rs.getString(3));
				System.out.println("DEPT PASS: "+rs.getString(4));
				System.out.println("DEPT STARTDATE: "+rs.getString(5));
				System.out.println("------------------------------------------------");
			}
			
			int deptno = 101;
			String deptNm = "AIML";
			String loc = "CSN";
			String pass = "1234";
			LocalDate ldt = LocalDate.now();
			String sqlDate = ldt.toString();
			String Query = "insert into dept values("+deptno+",'"+deptNm+"','"+loc+"','"+pass+"','"+sqlDate+"')";
			System.out.println(Query);
			
			int n = st.executeUpdate(Query);
			if(n > 0) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Record Not Inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
