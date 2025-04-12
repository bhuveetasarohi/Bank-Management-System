package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmgmt","root","12345678");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}