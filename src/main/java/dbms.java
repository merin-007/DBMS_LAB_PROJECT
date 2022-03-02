import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbms {
    static Connection conn = null;
    public static Connection dbconnect(){   
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");  
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs", "root", "Merin@123");
        //System.out.println("wfferwf");
        return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null ,e);
        System.out.println("wfferwf");
        return null;
    }
    }
}
