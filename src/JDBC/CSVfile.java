package JDBC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CSVfile {
	
	static Connection conn;
	static final String db_url="jdbc:mysql://localhost/marks";
	static final String user="amrat";
	static final String pass="root@123";
	public static void main(String[] args) throws IOException{
		
		String line;
		File file=new File("/home/agm6/Documents/program.csv");
		FileReader f=new FileReader(file);
		BufferedReader bf=new BufferedReader(f);
		ArrayList<String[]> data=new ArrayList<>();
		while((line = bf.readLine()) != null) {
            data.add(line.split(","));
            System.out.print("\n"+line);
		}
		   System.out.println("\n");
		bf.close();
			
		 try {
			 conn=DriverManager.getConnection(db_url,user,pass);
			 for(int i=1;i<data.size();i++) {
				 String[] tempArr=data.get(i);
				 String Name=tempArr[0];
				 String Subject=tempArr[1];
	             int marks = Integer.parseInt(tempArr[2]);
	             String grade=calculateGrade(marks);
				 PreparedStatement ps=conn.prepareStatement("insert into StudentData(Name,Subject,Grade,Marks)values(?,?,?,?)");
				 ps.setString(1, Name);
				 ps.setString(2, Subject);
				 ps.setString(3, grade);
				 ps.setString(4, String.valueOf(marks));
				 ps.executeUpdate();
				 System.out.println("the data is inserted");
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	private static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

}



