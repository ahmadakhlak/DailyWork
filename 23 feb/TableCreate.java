package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		// 2.1 Establish the connection
		String url = "jdbc:mysql://localhost:3306/CtsPune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		Statement stat = conn.createStatement();
		// String query = "create table user(id int primary key,name varchar(50),"
		// + "phone varchar(10),address varchar(100))";
		// stat.executeUpdate(query);

		// String query1="insert into user values(32,'Ahmad','7588235','Indore')";
		// stat.executeUpdate(query1);
		// String query="update user set name='suhel' where id=1";
		// stat.executeUpdate(query);

		String query = "delete from user where id=1";
		stat.executeUpdate(query);

	}

}
