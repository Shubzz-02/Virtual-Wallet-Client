import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/*
 * Created by JFormDesigner on Sat Nov 24 13:30:42 GMT 2018
 */


/**
 * @author Subhash Rawat
 */
public class Logingui extends JFrame {
    public Client_HomePage cl = null;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JLabel Llogin;
    private JLabel Laccno;
    private JLabel Lpass;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton Blogin;
    private JLabel Lneed;
    private JButton Bsignup;

    Logingui() {
        super("Login");
        JFrame jframe = new JFrame();
        jframe.setBackground(Color.blue);
        jframe.setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void actions(ActionEvent e) {
        if (e.getSource() == Bsignup) {
            new verifyOTP(this);
            setVisible(false);

        }
        if (e.getSource() == Blogin) {
            try {
                String user = userField.getText();
                String pass = String.valueOf(passwordField.getPassword());
                if (user.trim().equals("") || pass.trim().equals("")) {
                    JOptionPane.showMessageDialog(this, "Enter Username or Password");
                } else {
                    //String user_pass = String.format("501 %s %s", user, pass);
                    JSONObject data = new JSONObject();
                    data.put("code", "501");
                    data.put("ano", user);
                    data.put("pass", pass);
                    //Main.output.println(user_pass);
                    System.out.println(data.toString());
                    Main.output.println(data.toString());
                    String response = Main.input.readLine();
                    System.out.println(response);
                    if (response.equalsIgnoreCase("Success")) {
                        cl = new Client_HomePage(user);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong Username or Password");
                        userField.setText("");
                        passwordField.setText("");
                    }
                }
            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Subhash Rawat
        Llogin = new JLabel();
        Laccno = new JLabel();
        Lpass = new JLabel();
        userField = new JTextField();
        passwordField = new JPasswordField();
        Blogin = new JButton();
        Lneed = new JLabel();
        Bsignup = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- Llogin ----
        Llogin.setText("LOGIN");

        //---- Laccno ----
        Laccno.setText("Account Number :");

        //---- Lpass ----
        Lpass.setText("Password :");

        //---- Blogin ----
        Blogin.setText("LOGIN");

        //---- Lneed ----
        Lneed.setText("Need a new account");

        //---- Bsignup ----
        Bsignup.setText("Sign Up");
        Bsignup.addActionListener(e -> actions(e));
        Blogin.addActionListener(e -> actions(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addComponent(Llogin, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(Laccno, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(userField, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(Lpass, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(Blogin)
                                                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                                                .addComponent(Lneed)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Bsignup)))))
                                .addContainerGap(113, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(Llogin, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Laccno, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Lpass, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Blogin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(Lneed)
                                        .addComponent(Bsignup))
                                .addGap(0, 74, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
