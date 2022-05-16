package Scientific_Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame{
    private JPanel Main_Panel;
    private JTextField txtDisplay;
    private JButton btnRoot;
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
    private JButton btnBckspc;
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

    double first;
    double second;
    double result;
    String Operation;
    String answer;
    public MainApp() {
        setContentPane(Main_Panel);
        setTitle("Scientific Calculator");
        setSize(450, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn0.getText();
                txtDisplay.setText(Number);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn1.getText();
                txtDisplay.setText(Number);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn2.getText();
                txtDisplay.setText(Number);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn3.getText();
                txtDisplay.setText(Number);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn4.getText();
                txtDisplay.setText(Number);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn5.getText();
                txtDisplay.setText(Number);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn6.getText();
                txtDisplay.setText(Number);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn7.getText();
                txtDisplay.setText(Number);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn8.getText();
                txtDisplay.setText(Number);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btn9.getText();
                txtDisplay.setText(Number);
            }
        });

        btnClr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(null);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                Operation = "+";
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                Operation = "-";
            }
        });
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                Operation = "*";
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                Operation = "/";
            }
        });
        btnPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                Operation = "%";
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second = Double.parseDouble(txtDisplay.getText());
                if (Operation == "+"){
                    result = first + second;
                    answer = String.format("%.2f",result);
                    txtDisplay.setText(answer);
                }
                else if(Operation == "-"){
                    result = first - second;
                    answer = String.format("%.2f",result);
                    txtDisplay.setText(answer);
                }
                else if(Operation == "*"){
                    result = first * second;
                    answer = String.format("%.2f",result);
                    txtDisplay.setText(answer);
                }
                else if (Operation == "/"){
                    result = first / second;
                    answer = String.format("%.2f",result);
                    txtDisplay.setText(answer);
                }
                else if (Operation == "%"){
                    result = first % second;
                    answer = String.format("%.2f",result);
                    txtDisplay.setText(answer);
                }
                else if (Operation == "X^Y"){
                    double expResult=1;
                    for(int i = 0; i<second;i++)
                    {
                        expResult=first*expResult;
                    }
                    result = first % second;
                    answer = String.format("%.2f",expResult);
                    txtDisplay.setText(answer);
                }
            }
        });
        btnBckspc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bckspc = null;

                if(txtDisplay.getText().length()>0){
                    StringBuilder str = new StringBuilder(txtDisplay.getText());
                    str.deleteCharAt(txtDisplay.getText().length()-1);
                    bckspc=str.toString();
                    txtDisplay.setText(bckspc);
                }
            }
        });
        btnSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.sin(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.cos(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.tan(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnSinH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.sinh(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnCosH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.cosh(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnTanH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.tanh(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.log(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnERX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.exp(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnOX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=1/(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnPosNeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double b = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                b = b*(-1);
                txtDisplay.setText(String.valueOf(b));
            }
        });
        btnFact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c = Double.parseDouble(txtDisplay.getText());
                double fact = 1;
                while(c!=0)
                {
                    fact = fact*c;
                    c--;
                }
                txtDisplay.setText("");
                txtDisplay.setText(txtDisplay.getText()+fact);
            }
        });
        btnXR2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d=(Double.parseDouble(txtDisplay.getText()));
                d = d*d;
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+d);
            }
        });
        btnXR3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double f =(Double.parseDouble(txtDisplay.getText()));
                f = f*f*f;
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+f);
            }
        });
        btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.sqrt(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText(null);
                txtDisplay.setText(txtDisplay.getText()+a);
            }
        });
        btnXRY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                Operation = "X^Y";
            }
        });
        offRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn0.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btnBckspc.setEnabled(false);
                btnClr.setEnabled(false);
                btnCos.setEnabled(false);
                btnCosH.setEnabled(false);
                btnSin.setEnabled(false);
                btnSinH.setEnabled(false);
                btnTan.setEnabled(false);
                btnTanH.setEnabled(false);
                btnDeci.setEnabled(false);
                btnDiv.setEnabled(false);
                btnEqual.setEnabled(false);
                btnERX.setEnabled(false);
                btnXR2.setEnabled(false);
                btnXR3.setEnabled(false);
                btnXRY.setEnabled(false);
                btnFact.setEnabled(false);
                btnLog.setEnabled(false);
                btnSub.setEnabled(false);
                btnMul.setEnabled(false);
                btnPlus.setEnabled(false);
                btnPosNeg.setEnabled(false);
                btnPercent.setEnabled(false);
                btnRoot.setEnabled(false);
                btnOX.setEnabled(false);
                txtDisplay.setText(null);
            }
        });
        onRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn0.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btnBckspc.setEnabled(true);
                btnClr.setEnabled(true);
                btnCos.setEnabled(true);
                btnCosH.setEnabled(true);
                btnSin.setEnabled(true);
                btnSinH.setEnabled(true);
                btnTan.setEnabled(true);
                btnTanH.setEnabled(true);
                btnDeci.setEnabled(true);
                btnDiv.setEnabled(true);
                btnEqual.setEnabled(true);
                btnERX.setEnabled(true);
                btnXR2.setEnabled(true);
                btnXR3.setEnabled(true);
                btnXRY.setEnabled(true);
                btnFact.setEnabled(true);
                btnLog.setEnabled(true);
                btnSub.setEnabled(true);
                btnMul.setEnabled(true);
                btnPlus.setEnabled(true);
                btnPosNeg.setEnabled(true);
                btnPercent.setEnabled(true);
                btnRoot.setEnabled(true);
                btnOX.setEnabled(true);
            }
        });
        btnDeci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Number = txtDisplay.getText()+btnDeci.getText();
                txtDisplay.setText(Number);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new MainApp();

    }
}
