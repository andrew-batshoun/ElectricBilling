package Electricity;

import java.sql.*;


public class Conn {
    Connection connect;
    Statement stmt;

    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connect =  DriverManager.getConnection(Config.getUrl(), Config.getUser(), Config.getPass());
            stmt = connect.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
