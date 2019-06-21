import org.json.JSONException;
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
public class Withdraw extends JFrame implements ActionListener {
    String response = new String();
    String s = new String();
    Client_HomePage cl;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JLabel Lwithdraw;
    private JLabel Ldate;
    private JFormattedTextField Tdate;
    private JLabel Lamount;
    private JTextField Tamount;
    private JButton Bwithdraw;
    private JButton Bback;
    private String accno;

    public Withdraw(Client_HomePage x, String accno) {
        super("Withdraw");
        initComponents();
        cl = x;
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.accno = accno;
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Subhash Rawat
        Lwithdraw = new JLabel();
        Ldate = new JLabel();
        Tdate = new JFormattedTextField();
        Lamount = new JLabel();
        Tamount = new JTextField();
        Bwithdraw = new JButton();
        Bback = new JButton();
        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd");
        Tdate.setText(ft.format(dNow));

        //======== this ========
        Container contentPane = getContentPane();

        //---- Lwithdraw ----
        Lwithdraw.setText("Welcome To The Withdraw Section");

        //---- Ldate ----
        Ldate.setText("Date :");

        //---- Tdate ----
        Tdate.setEditable(false);

        //---- Lamount ----
        Lamount.setText("Enter the amount to withdraw :");

        //---- Bwithdraw ----
        Bwithdraw.setText("Withdraw");
        Bwithdraw.addActionListener(this);

        //---- Bback ----
        Bback.setText("Back");
        Bback.addActionListener(this);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lwithdraw, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(Bwithdraw, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Bback))
                                        .addComponent(Tamount, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 37, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Lwithdraw, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(Bwithdraw)
                                        .addComponent(Bback))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Bwithdraw) {
            //Main.output.println(Tamount);
            // try {
            //response = Main.input.readLine();
            //response = "yes";
            //  } catch (IOException e1) {
            //System.out.println("error");
            //}
            try {
                JSONObject data = new JSONObject();
                data.put("code", "504");
                data.put("amount", Tamount.getText());
                data.put("accno", accno);
                Main.output.println(data.toString());
                response = Main.input.readLine();
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(this, "some error occured");
            }
            if (response.equalsIgnoreCase("success")) {
                s = "Your Withdraw is SUCCESSFUL";
                JOptionPane.showMessageDialog(this, s);
                //new Return(s);
            } else if (response.equalsIgnoreCase("failed")) {
                s = "Unsuccessful you do not have enough balance in your account";
                JOptionPane.showMessageDialog(this, s);
                // new Return(s);
            }
        }
        if (e.getSource() == Bback) {

            cl.setVisible(true);
            dispose();
            Tamount.setText("");
        }
    }
}
