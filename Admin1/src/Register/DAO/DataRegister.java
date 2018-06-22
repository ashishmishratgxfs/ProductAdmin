package Register.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import model.com.RegisterModel;

public class DataRegister {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/fbooking";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public void addtodb(RegisterModel ADD)
	{
	
		Connection conn = null;
		Statement stmt = null;
		
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "INSERT INTO register(Empid, Empname,DOJ, DOE,Deptname,Password)VALUES ("+ADD.getEmpid()+",'"+ADD.getEmpname()+"','"+ADD.getDOJ()+"','"+ADD.getDOE()+"','"+ADD.getDeptname()+"','"+ADD.getPassword()+"');"; 
			System.out.println(query);
			int result = stmt.executeUpdate(query);
			stmt.close();
			conn.close();
		}
		
		catch (Exception e)
		{
			
			System.out.println("Exception Occured"+e);
		}
		
	}
	
}
