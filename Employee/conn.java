package Employee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","ritesh123456");    
            s =c.createStatement();
            //System.out.println("loaded");
        }catch(Exception e) {
            e.printStackTrace();
            //System.out.println("Not loaded");
        }
    }
    public static void main(String[] arg){
        new conn();
    }
}
 
