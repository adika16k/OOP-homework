import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JDBC {
    private Connection theConnection;
    private final String URL = "jdbc:postgresql://localhost:5432/students";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "adilkhaniadiki";
    private String pass;
    private String username;
    String query = "select * from users";
    public JDBC() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.theConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = theConnection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                pass=result.getString(2);
                username=result.getString(1);}
        } catch (Exception ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getPass(){
        return pass;
    }
    public String getUsername(){
        return username;
    }
}