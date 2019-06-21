import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Mon Nov 26 00:52:14 GMT 2018
 */


/**
 * @author Subhash Rawat
 */
public class About_Us extends JFrame implements ActionListener {
    Client_HomePage cl;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel LAbout;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JPanel buttonBar;
    private JButton Bgotit;

    public About_Us(Client_HomePage x) {
        super("About Us");
        setVisible(true);
        initComponents();
        cl = x;
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Subhash Rawat

        dialogPane = new JPanel();
        contentPanel = new JPanel();
        LAbout = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        buttonBar = new JPanel();
        Bgotit = new JButton();
        setVisible(true);
        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        Bgotit.addActionListener(this);

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));


            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- LAbout ----
                LAbout.setText("ABOUT US");

                //---- label2 ----
                label2.setText("This Virtual Wallet project is made by :");

                //---- label3 ----
                label3.setText("Babita Kumari");

                //---- label4 ----
                label4.setText("Praful Upadhyaya");

                //---- label5 ----
                label5.setText("Subhash Rawat");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                        contentPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                        .addContainerGap(150, Short.MAX_VALUE)
                                        .addComponent(LAbout, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                        .addGap(239, 239, 239)
                                                        .addGroup(contentPanelLayout.createParallelGroup()
                                                                .addComponent(label3)
                                                                .addComponent(label4)))
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(label2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(label5)))
                                        .addContainerGap(42, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                        contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(LAbout, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label5))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label3)
                                        .addGap(18, 18, 18)
                                        .addComponent(label4)
                                        .addContainerGap(45, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout) buttonBar.getLayout()).columnWidths = new int[]{0, 80};
                ((GridBagLayout) buttonBar.getLayout()).columnWeights = new double[]{1.0, 0.0};

                //---- Bgotit ----
                Bgotit.setText("Back");
                buttonBar.add(Bgotit, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Bgotit) {
            //new Client_HomePage();
            cl.setVisible(true);
            setVisible(false);
        }
    }

}


