import java.sql.*; 
 
public class DBConnectionDemo { 
    public static void main(String[] args) { 
        String driver = "com.mysql.jdbc.Driver"; 
        String url = "jdbc:mysql://localhost:3306/GUESTBOOK"; // database
        String user = ""; //user
        String password = ""; //password
        try { 
            Class.forName(driver); 
            Connection conn = 
               DriverManager.getConnection(url, 
                                  user, password);
 
            if(conn != null && !conn.isClosed()) {
                System.out.println("資料庫連線測試成功！"); 
                conn.close();
            }
            
        } 
        catch(ClassNotFoundException e) { 
            System.out.println("找不到驅動程式類別"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 


