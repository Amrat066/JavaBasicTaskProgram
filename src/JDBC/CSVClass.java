package JDBC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class CSVClass {

	static final String db_url="jdbc:mysql://localhost/CSVDB";
	static final String user="amrat";
	static final String pass="root@123";
	public static void main(String[] args) throws IOException {
		
//		File file=new File("/home/agm6/Documents/amrat.csv");
//		FileReader f=new FileReader(file);
//		BufferedReader reader=new BufferedReader(f);
		BufferedReader reader=new BufferedReader(new FileReader("/home/agm6/Documents/amrat.csv"));
		String line;
		ArrayList<String[]>data=new ArrayList<>();
		while(((line=reader.readLine())!=null)) {
			data.add(line.split(","));
			System.out.println(line);
		}
		System.out.println("\n");
		
			
				try
				{
					Connection conn=DriverManager.getConnection(db_url,user,pass);
					for(int i=1;i<data.size();i++) {
						String[]user=data.get(i);
						String name=user[0];
						PreparedStatement pst=conn.prepareStatement("select * from CSVdata where Name=?");
						pst.setString(1, name);
						ResultSet rs=pst.executeQuery();
						if(rs.next()) {
							System.out.println("the user is exist");
						}
						else {
							String sub=user[1];
							int mark=Integer.parseInt(user[2]);
							String address=user[3];
							String grade=GradeCalc(mark);
							PreparedStatement ps=conn.prepareStatement("insert into CSVdata(Name,Subject,Marks,Grade,Address)values(?,?,?,?,?)");
							ps.setString(1, name);
							ps.setString(2, sub);
							ps.setInt(3, mark);
							ps.setString(4, grade);
							ps.setString(5,address);
							ps.executeUpdate();
							System.out.println("the data is inserted");
							
						}
						
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			
	
	}
	private static String GradeCalc(int marks) {
		if (marks >= 90) {
            return "A+";
		}
		else if(marks>=80) {
			return "A";
		}
		else if(marks>=70) {
			return "C";
		}
		else if(marks>=60) {
			return "D";
		}else {
			return "Fail";
		}
	}
}