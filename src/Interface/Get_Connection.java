package Interface;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


public class Get_Connection {
    public static Statement connecion() throws Exception{
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/channeling", "root", "123");
       Statement statement = con.createStatement();
       return statement;
    }
}

