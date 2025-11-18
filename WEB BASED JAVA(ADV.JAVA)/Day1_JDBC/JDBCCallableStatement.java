

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCallableStatement {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url ="jdbc:mysql://192.168.10.117:3306/dac4?useSSL=false";
			conn=DriverManager.getConnection(url,"dac4","welcome");
			if(conn != null) {
				System.out.println("Connection is Done .");
			}else {
				System.out.println("Connection is not Done.");
			}
			CallableStatement cst=conn.prepareCall("call getcnt(?,?)");
			cst.setInt(1, 10);
			cst.registerOutParameter(2, java.sql.Types.INTEGER);
			cst.execute();
			int cnt=cst.getInt(2);
			System.out.println("count : "+cnt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
