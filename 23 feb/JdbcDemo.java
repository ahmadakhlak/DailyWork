package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		//1. load database driver
		
		//1.1 by using forNAme() method
		
		Class.forName("com.mysql.jdbc.Driver");
		//1.2 
		//Driver driver=new com.mysql.jdbc.Driver(); 
		
		//2.1 Establish the connection
		String url="jdbc:mysql://localhost:3306/CtsPune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		//System.out.println(conn.getClass().getName());
		Statement stat=conn.createStatement();
		//String query="insert into employee values(4,'suhel','varanasi',22,75882351)";
		//String query="update employee set address='thane' where id=2";
		//String query="delete from employee  where id=2";
		String query="select * from employee";
	/*	int result=stat.executeUpdate(query);
		if(result>0) {
			System.out.println("record deleted successfully");
		}
		else {
			System.out.println("Something went wrong");
		} */
		
		 ResultSet rs=stat.executeQuery(query);
		 while(rs.next()) {
			 int id=rs.getInt(1);
			 String name=rs.getString(2);
			 String address=rs.getString(3);
			 int age= rs.getInt(4);
			 long phone=rs.getLong(5);
			 System.out.println(id+" : "+name+" : "+address+" : "+age+" : "+phone);
			 
		 }
	}

}
