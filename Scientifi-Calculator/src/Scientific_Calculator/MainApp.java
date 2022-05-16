package Scientific_Calculator;

import javax.swing.*;

public class MainApp {
    private JPanel Main_Panel;
    private JTextField textField1;
    private JButton btnR;
    private JButton btnOX;
    private JButton btnXRY;
    private JButton btnXR3;
    private JButton btnXR2;
    private JButton btnFact;
    private JButton btnPosNeg;
    private JRadioButton onRadioButton;
    private JButton btnERX;
    private JButton btnLog;
    private JButton btnPercent;
    private JButton btn7;
    private JButton btn4;
    private JButton btnSin;
    private JButton btnSinH;
    private JButton btnClr;
    private JButton btn8;
    private JButton btn5;
    private JButton btnCos;
    private JButton btnCosH;
    private JButton btnB;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnTan;
    private JButton btnTanH;
    private JButton btnSub;
    private JButton btnMul;
    private JButton btnDiv;
    private JLabel title;
    private JButton btnDeci;
    private JButton btnEqual;
    private JButton btn2;
    private JButton btn1;
    private JButton btn0;
    private JButton btnPlus;
    private JRadioButton offRadioButton;

    public static void main(String[] args){
        JFrame frame = new JFrame("MainApp");
        frame.setContentPane(new MainApp().Main_Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
