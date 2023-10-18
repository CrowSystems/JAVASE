import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql. Statement;

public class Main{
    public static void main(String[] args) {
        Connection myConn = null;
        Statement myStamt = null;
        ResultSet myRes = null;

        try {
            myConn = DriverManager.getConnection("null","","");
            System.out.println("Conexión generada.");
        }
    }
}