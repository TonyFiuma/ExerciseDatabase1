import java.sql.*;

public class Main{
    public static void main(String[] args){


        Connection conn = null;
        try{
            // db parameters
            String url      = "jdbc:mysql://localhost:3306/newdb";
            String user     = "root";
            String password = "password";

            // create a connection to the database
            conn = DriverManager.getConnection(url,user,password);

            // more processing here
            System.out.println(String.format("Connected to database %s successfully.",conn.getCatalog()));
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if(conn != null)
                    conn.close();
            }catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}