/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


public class Get_Connection {
    public static Statement connecion() throws Exception{
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mydb", "root", "123");
       Statement statement = con.createStatement();
       return statement;
    }
}
