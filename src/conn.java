import java.sql.*;

public class conn{

    public Connection c;
    public Statement s;

    public conn(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://FNHANJAFQM9BBT7\\sqlexpress:8888;databaseName=QLNV","sa","123456");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
