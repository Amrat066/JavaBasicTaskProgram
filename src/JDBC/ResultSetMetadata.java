package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetadata {
	
	static Connection conn;
	static final String db_url="jdbc:mysql://localhost/jdbc";
	static final String user="amrat";
	static final String pass="root@123";
	static final String query="insert into User_master(Uname,Address,Salary,img)values(?,?,?,?)";
	public static void main(String[] args) throws Exception {
		conn=DriverManager.getConnection(db_url,user,pass);
//		Statement st=conn.createStatement();
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1, "amrat");
		ps.setString(2, "surat");
		ps.setInt(3, 4000);
		FileInputStream fs=new FileInputStream("/home/agm6/Documents/ff.svg");
		ps.setBinaryStream(4,fs,fs.available());
		ps.executeUpdate();
		System.out.println("inserted");
//		ResultSet r=st.executeQuery(query);
//		ResultSetMetaData m=r.getMetaData();
//			System.out.println("Total columns: "+m.getColumnCount());  
//			System.out.println("Column Name of 1st column: "+m.getColumnName(1));  
//			System.out.println("Column Type Name of 1st column: "+m.getColumnTypeName(1)); 
//			System.out.println("the table name is:="+m.getTableName(1));
//			DatabaseMetaData dbmd=conn.getMetaData();  
//			String table[]={"TABLE"};  
//			ResultSet rs=dbmd.getTables(null,null,null,table);  
//			  
//			while(rs.next()){  
//			System.out.println(rs.getString(3));  
//			}  
//

			  
		
		
		
	}

}
