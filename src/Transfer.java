import org.json.JSONObject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Nov 27 13:33:17 GMT 2018
 */


/**
 * @author Subhash Rawat
 */
public class Transfer extends JFrame implements ActionListener {
    Client_HomePage cl;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JLabel label1;
    private JLabel Lacc;
    private JTextField Tacc;
    private JLabel Lreacc;
    private JTextField Treacc;
    private JLabel Lamount;
    private JTextField Tamount;
    private JButton Btransfer;
    private JButton Bcancel;
    private String accno;

    public Transfer(Client_HomePage x, String accno) {
        super("Transfer");
        initComponents();
        cl = x;
        setVisible(true);
        this.accno = accno;
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Subhash Rawat
        label1 = new JLabel();
        Lacc = new JLabel();
        Tacc = new JTextField();
        Lreacc = new JLabel();
        Treacc = new JTextField();
        Lamount = new JLabel();
        Tamount = new JTextField();
        Btransfer = new JButton();
        Bcancel = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("TRANSFER ");

        //---- Lacc ----
        Lacc.setText("Account number :");

        //---- Lreacc ----
        Lreacc.setText("Re-Enter :");

        //---- Lamount ----
        Lamount.setText("Amount :");

        //---- Btransfer ----
        Btransfer.setText("Transfer");
        Btransfer.addActionListener(this);

        //---- Bcancel ----
        Bcancel.setText("Cancel");
        Bcancel.addActionListener(this);


        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(Lacc)
                                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Lamount)
                                                                .addComponent(Lreacc)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(Btransfer)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Bcancel))
                                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(Tacc, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                                                .addComponent(Treacc, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                                                .addComponent(Tamount, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(96, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Lacc)
                                        .addComponent(Tacc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(Lreacc)
                                        .addComponent(Treacc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(Lamount))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(Tamount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Btransfer)
                                        .addComponent(Bcancel))
                                .addContainerGap(38, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Btransfer) {
            if (Tacc.getText().trim().equals("") || Treacc.getText().trim().equals("") || Tamount.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "fill all details");
            } else {
                if (Tacc.getText().equals(Treacc.getText())) {
                    String response;
                    //Main.output.println(Tamount);
                    // try {
                    //response = Main.input.readLine();
                    response = "failed";
                    //  } catch (IOException e1) {
                    //System.out.println("error");
                    //}
                    try {
                        JSONObject data = new JSONObject();
                        data.put("code", "506");
                        data.put("otheraccno", Tacc.getText());
                        data.put("accno", accno);
                        data.put("amount", Tamount.getText());
                        Main.output.println(data.toString());
                        response = Main.input.readLine();
                    } catch (Exception ee) {

                    }
                    if (response.equalsIgnoreCase("success")) {
                        JOptionPane.showMessageDialog(this, "Succcessful transfered");
                    } else {
                        JOptionPane.showMessageDialog(this, "Unsucccessful..not enough amount");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Account numbers did not match");
                }
            }
            Tamount.setText("");
            Treacc.setText("");
            Tacc.setText("");
        }
        if (e.getSource() == Bcancel) {
            cl.setVisible(true);
            dispose();
        }
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
