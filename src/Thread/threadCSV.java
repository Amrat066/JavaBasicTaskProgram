package Thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class threadCSV {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/CSVDB";
    private static final String USERNAME = "amrat";
    private static final String PASSWORD = "root@123";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            BufferedReader br = new BufferedReader(new FileReader("/home/agm6/Documents/program.csv"));

            Thread insertThread = new Thread(() -> {
                String line;
                String insertSQL = "INSERT INTO CSVtable (Name,Subject,Marks) VALUES (?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                    br.readLine();

                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(",");
                        for (int i = 0; i < values.length; i++) {
                            preparedStatement.setString(i + 1, values[i]);                            
                            
                        }
                        
                        preparedStatement.executeUpdate();
                    }
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        br.close();
                        connection.close();
                    } catch (IOException | SQLException e) {
                        e.printStackTrace();
                    }
                }
            });

            insertThread.start();
            insertThread.join();

        } catch (IOException | SQLException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
