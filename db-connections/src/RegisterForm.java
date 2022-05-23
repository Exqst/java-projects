import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RegisterForm extends JDialog{
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAddress;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPass;
    private JButton btnRegis;
    private JButton btnCancel;
    private JPanel RegisterPanel;

    public RegisterForm(){
        setTitle("Create a new account");
        setContentPane(RegisterPanel);
        setSize(450, 500);
        setModal(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        btnRegis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createUser();
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

    private void createUser() {
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String address = tfAddress.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String confirmPassword= String.valueOf(pfConfirmPass.getPassword());

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please don't leave anything blank", "Try Again", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(this, "Password does not match", "Try Again", JOptionPane.ERROR_MESSAGE);
            return;
        }

        user = addUserToDB(name, email, phone, address, password);
        if(user != null){
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(this, "Failed to register new user", "Try Again", JOptionPane.ERROR_MESSAGE);
        }
    }
    public User user;
    private User addUserToDB (String name, String email, String phone, String address, String password){
        User user = null;
        final String url = "jdbc:ucanaccess://E://Projects//java-projects//db-connections//Accounts.accdb";

        try{
            Connection con = DriverManager.getConnection(url);

            Statement st = con.createStatement();
            String sql = "INSERT INTO user (name, email, phone, address, password) " + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, name);
            pr.setString(2, email);
            pr.setString(3, phone);
            pr.setString(4, address);
            pr.setString(5, password);

            int addRows = pr.executeUpdate();
            if (addRows > 0){
                user = new User();
                user.name = name;
                user.email = email;
                user.phone = phone;
                user.address = address;
                user.password = password;
            }

            st.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
    public static void main (String[] args){
        RegisterForm regForm = new RegisterForm();
        User user = regForm.user;
        if(user != null){
            System.out.print("Successful registration of: " + user.name);
        }
        else {
            System.out.print("Registration Cancelled");
        }
    }
}
