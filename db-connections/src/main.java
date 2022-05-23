import java.sql.*;
public class main {
    public static void main (String [] args) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://E://Projects//java-projects//db-connections//TestRun.accdb");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Students");

        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        con.close();
    }
}
