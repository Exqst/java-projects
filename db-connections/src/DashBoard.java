import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DashBoard extends JFrame{
    private JPanel dashboardPanel;
    private JLabel lblAdmin;
    private JButton btnRegUser;


    public DashBoard(){
        setTitle("Dashboard");
        setContentPane(dashboardPanel);
        setSize(1200, 700);
        setMinimumSize(new Dimension(500, 430));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        boolean RegedUsers = connectToDatabase();
        if(RegedUsers){
            LoginForm loginForm = new LoginForm();
            User user = loginForm.user;

            if (user != null){
                lblAdmin.setText("User: " + user.name);
                setLocationRelativeTo(null);
                setVisible(true);
            }
            else {
                dispose();
            }
        }
        else {
            RegisterForm registerForm = new RegisterForm();
            User user = registerForm.user;

            if(user != null){
                lblAdmin.setText("User: " + user.name);
                setLocationRelativeTo(null);
                setVisible(true);
            }
            else{
                dispose();
            }
        }
        btnRegUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterForm registerForm = new RegisterForm();
                User user = registerForm.user;

                if (user != null){
                    JOptionPane.showMessageDialog(DashBoard.this, "New User: " + user.name, "Successful Registration", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public boolean connectToDatabase(){
        boolean hasRegisteredusers = false;
        final String url = "jdbc:ucanaccess://E://Projects//java-projects//db-connections//Accounts.accdb";

        try{
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            /*st.executeUpdate("CREATE DATABASE IF NOT EXISTS Accounts");
            st.close();
            con.close();

            con = DriverManager.getConnection(url);
            st =con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS user ("
                    + "id INT(10) NOT NULL PRIMARY KEY AUTO-INCREMENT,"
                    + "name VARCHAR(200) NOT NULL, "
                    + "email VARCHAR (200) NOT NULL UNIQUE, "
                    + "phone VARCHAR (200),"
                    + "address VARCHAR (200), "
                    + "password VARCHAR (200) NOT NULL"
                    + ")";
            st.executeUpdate(sql);

            //Doesn't work or I am just stupid that UCanAccess is not like mysql where it can create a database when it does not exists
            //There is probably a way around it but cannot find it at google
            */

            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT (*) FROM user");

            if(rs.next()){
                int numUsers = rs.getInt(1);
                if(numUsers > 0){
                    hasRegisteredusers = true;
                }
            }
            st.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return hasRegisteredusers;
    }

    public static void main(String[] args) {
        DashBoard myDash = new DashBoard();
    }
}
