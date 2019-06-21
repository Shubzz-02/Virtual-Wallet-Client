import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECField;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Nov 23 18:15:03 IST 2018
 */


/**
 * @author Subhash Rawat
 */
public class Client_HomePage extends JFrame implements ActionListener {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JButton profile;
    private JButton deposit;
    private JButton withdraw;
    private JButton transfer;
    private JButton about;
    private JButton logout;
    private JLabel image;
    private String accno;

    Client_HomePage(String accno) {
        super("Welcome to Banking Network Home Page");
        this.accno = accno;
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Subhash Rawat
        profile = new JButton();
        deposit = new JButton();
        withdraw = new JButton();
        transfer = new JButton();
        about = new JButton();
        logout = new JButton();
        image = new JLabel();
        withdraw.addActionListener(this);
        about.addActionListener(this);
        deposit.addActionListener(this);
        transfer.addActionListener(this);
        logout.addActionListener(this);
        //======== this ========
        //setResizable(false);
        Container contentPane = getContentPane();

        //---- profile ----
        profile.setText("Profile");
        //profile.setIcon(new ImageIcon("C:\\Users\\Savitri\\Downloads\\BankApplication-master\\Banking_client\\image icons\\disconnect_logout_exit-512.png"));

        //---- deposit ----
        deposit.setText("Deposit");

        //---- withdraw ----
        withdraw.setText("Withdraw");

        //---- transfer ----
        transfer.setText("Transfer");

        //---- about ----
        about.setText("About");

        //---- logout ----
        logout.setText("Logout");

        //---- image ----

        image.setIcon(new ImageIcon("logo.jpg"));


        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(image, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(transfer, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(profile))
                                                .addGap(33, 33, 33)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(about, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                        .addComponent(deposit, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                                .addGap(30, 30, 30)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(logout, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(withdraw, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(image, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(withdraw, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deposit, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(profile, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(logout, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(about, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(transfer, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
        );
        profile.addActionListener(this);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == profile) {
            try {
                JSONObject ff = new JSONObject();
                ff.put("code", "507");
                ff.put("acc", accno);
                Main.output.println(ff.toString());
                new Profile(this, accno);
                setVisible(false);
            } catch (Exception ee) {
                System.out.println(ee.getMessage());
            }

        }
        if (e.getSource() == deposit) {
            new Deposit(this, accno);
            setVisible(false);
        }
        if (e.getSource() == withdraw) {
            new Withdraw(this, accno);
            setVisible(false);
        }
        if (e.getSource() == transfer) {
            new Transfer(this, accno);
            setVisible(false);
        }
        if (e.getSource() == about) {
            new About_Us(this);
            setVisible(false);
        }
        if (e.getSource() == logout) {
            new Logingui();
            dispose();
        }
    }
}
