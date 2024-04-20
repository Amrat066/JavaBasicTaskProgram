package JDBC;
import java.sql.*;

public class program1 {

           static final String DB_URL = "jdbc:mysql://localhost/practice";
           static final String USER = "amrat";
           static final String PASS = "root@123";
           static final String QUERY = "Insert into user_mst(uid,uname,address)values(?,?,?)";

           public static void main(String[] args) {
              // Open a connection
              try
              {
                  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            	  conn.setAutoCommit(false);
            	 
            	PreparedStatement stmt=conn.prepareStatement(QUERY);
            	stmt.setInt(1,10);
            	stmt.setString(2,"adfew");
            	stmt.setString(3, "oooo");
            	stmt.executeUpdate();
                System.out.println("Rows inserted ....");
            	  
//            	                 
//            		   while(rs.next()){
//            		       
//            		   }
//            		
//            		   rs.last();
//            		   
//            		   System.out.println(rs.getInt(1));
//            		   rs.updateString(2, "aswa");
//            		   rs.updateRow();

            		   
            	 
                 // Extract data from result set
//                 while (rs.next()) {
//                    // Retrieve by column name
//                    System.out.println("uID: " + rs.getInt(1));
//                    System.out.println("name: " + rs.getString(2));
//                    System.out.println("address: " + rs.getString(3));
//
//                 }
              } catch (SQLException e) {
                 e.printStackTrace();
              } 
           }

}

//import pkg
//load and register
//connection established
//statement create
//query execution resultset 
//display the data

//createstatement
//resultset
//executequery
//executeupdate
//executebatch
