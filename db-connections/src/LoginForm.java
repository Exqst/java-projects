import org.hsqldb.persist.Log;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginForm extends JDialog{
    private JTextField tfEmail;
    private JPasswordField pfPassword;
    private JButton btnOk;
    private JButton btnCancel;
    private JPanel LoginPanel;


    public LoginForm(){
        setTitle("Login");
        setContentPane(LoginPanel);
        setSize(500, 500);
        setModal(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tfEmail.getText();
                String password = String.valueOf(pfPassword.getPassword());

                user = getUser(email, password);

                if(user != null){
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Email or Password is invalid", "Try again", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static User user;
    private User getUser(String email, String password) {
        User user = null;
        final String url = "jdbc:ucanaccess://E://Projects//java-projects//db-connections//Accounts.accdb";
        try{
            Connection con = DriverManager.getConnection(url);

            Statement st = con.createStatement();
            String sql = "SELECT * FROM user WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                user = new User();
                user.name = rs.getString("name");
                user.email = rs.getString("email");
                user.phone = rs.getString("phone");
                user.address = rs.getString("address");
                user.password = rs.getString("password");
            }

            st.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }

    public static void main (String[] args){
        LoginForm LogForm = new LoginForm();
        User user = LoginForm.user;

        if(user != null){
            System.out.println("Success Login of " + user.name);
            System.out.println("Email: " + user.email);
            System.out.println("phone: " + user.phone);
            System.out.println("address: " + user.address);
        }
        else {
            System.out.println("Login Cancelled");
        }
    }
}
