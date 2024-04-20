package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserMaster {

	
	static Connection conn;
	static final String db_url="jdbc:mysql://localhost/jdbc";
	static final String user="amrat";
	static final String pass="root@123";
	static final String query="select * from User_master";
	
	public static void main(String[] args) throws Exception {
		
		try
		{
			conn=DriverManager.getConnection(db_url,user,pass);
			conn.setAutoCommit(false);
//			PreparedStatement stm= conn.prepareStatement(query);
//			stm.setInt(1, 12);
//			stm.setString(2, "pol");
//			stm.setString(3, "kadodra");
//			stm.setInt(4, 8000);
//			stm.executeUpdate();
//			conn.commit();	
//			System.out.println("transaction commited");
			Statement stm=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet st=stm.executeQuery(query);
				if(st.absolute(4)) {
				
//				st.updateString(3, "hii");
//				st.updateRow();
				System.out.print("\t Id:"+ st.getInt(1));
				System.out.print("\t Name:"+ st.getString(2));
				System.out.print("\t Address:"+st.getString(3));
				System.out.println("\t Salary:"+st.getInt(4));
				conn.commit();
			}
			

		}
		catch(Exception e) {
				conn.rollback();
				System.out.println(e.getMessage());
				
		}
	}
}
