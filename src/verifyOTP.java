import org.json.JSONObject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Fri Nov 30 11:35:35 IST 2018
 */


/**
 * @author Subhash Rawat
 */
public class verifyOTP extends JFrame implements ActionListener {
    Logingui login;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel mob;
    private JTextField mno;
    private JTextField plus91;
    private JButton send;
    private JPanel buttonBar;
    private JButton ok;
    private JButton cancel;
    private JLabel lotp;
    private JTextField otp;
    private String mobile_no;

    public verifyOTP(Logingui logingui) {
        super("otp");
        initComponents();
        setVisible(true);
        login = logingui;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        mob = new JLabel();
        mno = new JTextField();
        plus91 = new JTextField();
        send = new JButton();
        buttonBar = new JPanel();
        ok = new JButton();
        cancel = new JButton();
        lotp = new JLabel();
        otp = new JTextField();

        //======== this ========
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- mob ----
                mob.setText("Mobile Number");

                //---- mno ----
                mno.setEditable(true);

                //---- plus91 ----
                plus91.setText("+91");
                plus91.setEditable(false);

                //---- send ----
                send.setText("Send OTP!");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                        contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(send)
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                        .addComponent(mob)
                                                        .addGap(40, 40, 40)
                                                        .addComponent(plus91, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(mno, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(36, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                        contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(mno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(mob)
                                                .addComponent(plus91, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(send)
                                        .addContainerGap(16, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);

            //======== buttonBar ========
            {

                //---- ok ----
                ok.setText("OK");

                //---- cancel ----
                cancel.setText("Cancel");

                //---- lotp ----
                lotp.setText("Enter OTP");

                GroupLayout buttonBarLayout = new GroupLayout(buttonBar);
                buttonBar.setLayout(buttonBarLayout);
                buttonBarLayout.setHorizontalGroup(
                        buttonBarLayout.createParallelGroup()
                                .addGroup(buttonBarLayout.createSequentialGroup()
                                        .addGap(197, 197, 197)
                                        .addComponent(ok)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancel)
                                        .addContainerGap(12, Short.MAX_VALUE))
                                .addGroup(buttonBarLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lotp, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                        .addComponent(otp, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                );
                buttonBarLayout.setVerticalGroup(
                        buttonBarLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, buttonBarLayout.createSequentialGroup()
                                        .addContainerGap(17, Short.MAX_VALUE)
                                        .addGroup(buttonBarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(lotp)
                                                .addComponent(otp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(buttonBarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(ok)
                                                .addComponent(cancel))
                                        .addContainerGap())
                );
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        ok.addActionListener(this);
        cancel.addActionListener(this);
        send.addActionListener(this);
        setLocationRelativeTo(getOwner());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            String otpa = otp.getText();
            String result = new OTPHandler("91" + mno.getText(), otpa).verifyOTP();
            if (result.equalsIgnoreCase("success")) {
                dispose();
                new CreateAc(this, mno.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid OTP");
            }
        }
        if (e.getSource() == cancel) {
            login.setVisible(true);
            dispose();
        }
        if (e.getSource() == send) {
            send_OTP();
            JOptionPane.showMessageDialog(this, "OTP sent successfully");
        }

    }

    private void send_OTP() {
        try {
            mobile_no = mno.getText();
            JSONObject data = new JSONObject();
            data.put("code", "503");
            data.put("mno", mobile_no);
            Main.output.println(data.toString());
            String response = Main.input.readLine();

        } catch (Exception e) {
            System.out.println("ERORRR");
        }
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
