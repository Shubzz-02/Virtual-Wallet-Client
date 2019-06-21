import org.json.JSONObject;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Mon Nov 26 21:38:52 GMT 2018
 */


/**
 * @author Subhash Rawat
 */
public class Deposit extends JFrame implements ActionListener {
    String response = new String();
    String s = new String();
    Client_HomePage cl;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JLabel Ldeposit;
    private JLabel Ldate;
    private JFormattedTextField Tdate;
    private JLabel Lamount;
    private JTextField Tamount;
    private JButton Bdeposit;
    private JButton Bback;
    private String acc;

    public Deposit(Client_HomePage x, String a) {
        super("Deposit");
        cl = x;
        initComponents();
        acc = a;
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Bdeposit) {
            String d_amt = Tamount.getText().trim();
            if (d_amt == "") {
                JOptionPane.showMessageDialog(this, "No amount entered.");
            } else {
                try {
                    JSONObject deposit = new JSONObject();
                    deposit.put("code", "505");
                    deposit.put("ano", acc);
                    deposit.put("damount", d_amt);

                    Main.output.println(deposit.toString());
                    String response = Main.input.readLine();
                    if (response.contains("Failed")) {
                        JOptionPane.showMessageDialog(this, "Transaction not successful. Please try again.");
                    } else {

                        JOptionPane.showMessageDialog(this, "Amount successfully deposited");
                        Tamount.setText("");
                    }
                } catch (Exception ee) {
                    System.out.println(ee.getMessage());
                }
            }
            //Main.output.println(Tamount);
            // try {
            //response = Main.input.readLine();
            /*response = "yes";
            //  } catch (IOException e1) {
            //s="something went wrong";
            //JOptionPane.showMessageDialog(this, s);
            //}
            if (response.equalsIgnoreCase("yes")) {
                s = "AMOUNT DEPOSIT SUCCESSFULLY";
                JOptionPane.showMessageDialog(this, s);
                //new Return(s);
                Tamount.setText("");
            }*/

        }
        if (e.getSource() == Bback) {
            //new Client_HomePage();
            setVisible(false);
            cl.setVisible(true);
            dispose();
        }

    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Subhash Rawat
        Ldeposit = new JLabel();
        Ldate = new JLabel();
        Tdate = new JFormattedTextField();
        Lamount = new JLabel();
        Tamount = new JTextField();
        Bdeposit = new JButton();
        Bback = new JButton();
        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd");
        Tdate.setText(ft.format(dNow));

        //======== this ========
        Container contentPane = getContentPane();

        //---- Ldeposit ----
        Ldeposit.setText("Welcome To The Deposition Section");

        //---- Ldate ----
        Ldate.setText("Date :");

        //---- Tdate ----
        Tdate.setEditable(false);

        //---- Lamount ----
        Lamount.setText("Enter the amount to deposit:");

        //---- Bdeposit ----
        Bdeposit.setText("Deposit");
        Bdeposit.addActionListener(this);

        //---- Bback ----
        Bback.setText("Back");
        Bback.addActionListener(this);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ldeposit, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(Ldate)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Tdate))
                                        .addComponent(Lamount))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(Bdeposit, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Bback))
                                        .addComponent(Tamount, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 49, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Ldeposit, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Ldate, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(Lamount, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tamount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Bdeposit)
                                        .addComponent(Bback))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
