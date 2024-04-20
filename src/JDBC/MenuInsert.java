package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuInsert {
	
	static Connection con;
	static final String db_url="jdbc:mysql://localhost/jdbc";
	static final String user="amrat";
	static final String pass="root@123";
	static String Query="insert into User_master(Uname,Address,Salary)values(?,?,?)";
	public static void main(String args[]) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		con=DriverManager.getConnection(db_url,user,pass);
		PreparedStatement ps=con.prepareStatement(Query);
		con.setAutoCommit(false);
		do{  
			System.out.println("enter name:");  
			String Uname=sc.next();
			System.out.println("enter Address:");  
			String Address=sc.next();  
			System.out.println("enter salary:");  
			int salary=sc.nextInt(); 
			ps.setString(1,Uname); 
			ps.setString(2,Address); 
			ps.setInt(3,salary);  
			int i=ps.executeUpdate();  
			System.out.println("do you want to continous y/n");
			String s=sc.next();
			if(s.startsWith("n")) {
				System.out.print("inserted"+i);
				break;
			}
			
		}while(true);  
		  
		con.close();  
		
	}

}


