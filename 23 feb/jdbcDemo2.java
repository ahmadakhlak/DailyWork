package jdbc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.zip.InflaterInputStream;
import java.sql.Statement;

//import com.mysql.jdbc.PreparedStatement;

public class jdbcDemo2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("Enter employee id:");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter employee name:");
		String name=(br.readLine());
		System.out.println("Enter employee address:");
		String address=(br.readLine());
		System.out.println("Enter employee age:");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter employee phone:");
		Long phone=Long.parseLong(br.readLine());*/
		
		
		
		
		
	
	Class.forName("com.mysql.jdbc.Driver");

	String url = "jdbc:mysql://localhost:3306/CtsPune";
	Connection conn = DriverManager.getConnection(url, "root", "root");
	Statement stat=conn.createStatement();
	//String query="insert into employee values(?,?,?,?,?)";
	//String query="update employee set name=? where id=?";
	//String query="delete from employee where id=?";
	String query="select * from employee";
	//PreparedStatement ps=conn.prepareStatement(query);
	//ps.setString(1,name);
	///ps.setInt(2, id);
	//ps.setString(3, address);
	//ps.setInt(4, age);
	
	//ps.setLong(5, phone);
	//int result=ps.executeUpdate();
	/*if(result>0) {
		System.out.println("result inserted successfully");
	}
	else {
		System.out.println("try agaain");
	}*/
	//int result=stat.executeUpdate(query);

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