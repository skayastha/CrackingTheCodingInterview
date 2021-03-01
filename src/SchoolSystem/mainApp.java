package SchoolSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mainApp {

    public static void main (String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/devprojects", "root", "wUILnzojJ0dBhXEuxc0e");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("Select * from Professor");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
                con.close();

            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}
