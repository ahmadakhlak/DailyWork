package com.akhlak;
    import java.io.*;  
    import java.sql.*;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.*;  
      
    public class Register extends HttpServlet {  
    	
    public void doPost(HttpServletRequest request, HttpServletResponse response, String url)  
                throws ServletException, IOException {  
      
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
              
    String n=request.getParameter("Name");  
    String p=request.getParameter("id");  
    String e=request.getParameter("salary");  
  
              
    try{  
    	
    	Class.forName("com.mysql.jdbc.Driver");

    	 url = "jdbc:mysql://localhost:3306/CtsPune";
    	Connection conn = DriverManager.getConnection(url, "root", "root");
    	
      
    PreparedStatement ps=conn.prepareStatement( "insert into registeruser values(?,?,?)");  
      
    ps.setString(1,n);  
    ps.setString(2,p);  
    ps.setString(3,e);  
   
              
    int i=ps.executeUpdate();  
    if(i>0)  
    out.print("You are successfully registered...");  
          
              
    }catch (Exception e2) {System.out.println(e2);}  
              
    out.close();  
    }  
      
    }  