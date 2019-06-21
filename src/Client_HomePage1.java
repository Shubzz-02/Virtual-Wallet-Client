import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Fri Dec 07 09:56:57 IST 2018
 */



/**
 * @author Subhash Rawat
 */
public class Client_HomePage1 extends JFrame {
    public Client_HomePage1() {
        initComponents();
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

        //======== this ========
        setResizable(false);
        Container contentPane = getContentPane();

        //---- profile ----
        profile.setText("Profile");
        profile.setIcon(new ImageIcon("C:\\Users\\Savitri\\Downloads\\BankApplication-master\\Banking_client\\image icons\\disconnect_logout_exit-512.png"));

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
        image.setText("Image");

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
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JButton profile;
    private JButton deposit;
    private JButton withdraw;
    private JButton transfer;
    private JButton about;
    private JButton logout;
    private JLabel image;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
