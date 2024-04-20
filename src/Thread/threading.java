package Thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class threading {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/CSVDB";
    private static final String USERNAME = "amrat";
    private static final String PASSWORD = "root@123";

    public static void main(String args[]) throws SQLException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/agm6/Documents/program.csv"));
        String line;
        ArrayList<String[]> data = new ArrayList<>();

        while (((line = reader.readLine()) != null)) {
            data.add(line.split(","));
            System.out.println(line);
        }
        System.out.println("\n");

        try {
            Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            Thread t = new Thread() {
                @Override
                public void run() {
                    String insertSQL = "INSERT INTO CSVtable (Name, Subject, Marks) VALUES (?, ?, ?)";
                    try (PreparedStatement preparedStatement = conn.prepareStatement(insertSQL)) {
                    	for(int i=1;i<data.size();i++) {
    						String[]user=data.get(i);
    						
    						String name=user[0];
    						PreparedStatement pst=conn.prepareStatement("select * from CSVtable where Name=?");
    						pst.setString(1, name);
    						ResultSet rs=pst.executeQuery();
    						if(rs.next()) {
    							System.out.println("the user is exist");
    						}
    						else {
    							String sub=user[1];
    							int marks=Integer.parseInt(user[2]);
    							PreparedStatement ps=conn.prepareStatement("insert into CSVtable(Name,Subject,Marks)values(?,?,?)");
    							ps.setString(1, name);
    							ps.setString(2, sub);
    							ps.setInt(3, marks);
    							ps.executeUpdate();
    						}
    						
    					}
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            };

            t.start();
            t.join(); 

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

