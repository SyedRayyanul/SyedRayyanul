import java.sql.*;
public class javainsertsqlpractice {
    public static void main(String[] args) throws ClassNotFoundException {
        String url ="jdbc:mysql://localhost:3307/hotel_db";
        String username = "root";
        String password = "111222";
        String query = "INSERT INTO employees(id, name, job_title, salary) VALUES (3, 'Handy', 'Full stack developer', 87790.0)";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully");

        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url, password, username);
            System.out.println("Connection Established successfully !!");
            Statement stmt = con.createStatement();
            int rowsaffected = stmt.executeUpdate(query);

            if(rowsaffected>0) {
                System.out.println("Inset Successful" + rowsaffected + " rows(s) affected");
            }else{
                System.out.println("Insertion failed!");
            }
            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection Closed Successfully!!");
            }
        }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    }

