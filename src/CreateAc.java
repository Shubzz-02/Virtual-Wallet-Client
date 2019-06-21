import org.json.JSONObject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/*
 * Created by JFormDesigner on Wed Nov 21 21:35:44 IST 2018
 */


/**
 * @author Subhash Rawat
 */
public class CreateAc extends JFrame implements ActionListener {
    verifyOTP verifyOTP;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Subhash Rawat
    private JLabel fn;
    private JTextField fname;
    private JLabel ln;
    private JTextField lname;
    private JLabel laddr;
    private JLabel label4;
    private JLabel mob;
    private JLabel adno;
    private JLabel lgender;
    private JLabel ldob;
    private JLabel occ;
    private JTextField ano;
    private JTextField oc;
    private JTextField mno;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JRadioButton male;
    private JRadioButton female;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel label1;
    private JButton browse;
    private JLabel lnation;
    private JComboBox nationality;
    private JLabel label2;
    private JPasswordField password;
    private JButton register;
    private JButton clear;
    private JButton back;
    private ButtonGroup group;
    private JFileChooser browse_image;
    private FileNameExtensionFilter image_extension;// = new FileNameExtensionFilter("*.Images","jpg","jpeg","png");
    private File file;
    private FileInputStream fstream;
    private byte[] imageData;
    private String iData;
    private String pathImg;

    public CreateAc(verifyOTP verifyOTP, String mno) {

        super("Client");
        initComponents(mno);
        setVisible(true);
        this.verifyOTP = verifyOTP;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    private void initComponents(String mnum) {
        String country[] = {"India", "U.S.A", "Switzerland", "Singapur", "Pakistan"};
        String date_arr[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String month_arr[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int year_ar[] = new int[29];
        int y = 1990;
        for (int i = 0; i < 29; i++) {
            year_ar[i] = y + i;
        }
        String year_arr[] = new String[29];
        for (int i = 0; i < 29; i++) {
            year_arr[i] = String.valueOf(year_ar[i]);
        }

        fn = new JLabel();
        fname = new JTextField();
        ln = new JLabel();
        lname = new JTextField();
        laddr = new JLabel();
        label4 = new JLabel();
        mob = new JLabel();
        adno = new JLabel();
        lgender = new JLabel();
        ldob = new JLabel();
        occ = new JLabel();
        ano = new JTextField();
        oc = new JTextField();
        mno = new JTextField();
        mno.setColumns(10);
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        male = new JRadioButton();
        female = new JRadioButton();
        date = new JComboBox(date_arr);
        month = new JComboBox(month_arr);
        year = new JComboBox(year_arr);
        label1 = new JLabel();
        browse = new JButton();
        lnation = new JLabel();
        nationality = new JComboBox(country);
        label2 = new JLabel();
        password = new JPasswordField();
        register = new JButton();
        clear = new JButton();
        back = new JButton();
        group = new ButtonGroup();
        browse_image = new JFileChooser();
        image_extension = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png", "jpeg");


        //======== this ========
        setResizable(false);
        setBackground(new Color(0, 193, 202));
        setForeground(Color.black);
        Container contentPane = getContentPane();

        //---- fn ----
        fn.setText("Enter First Name");

        //---- ln ----
        ln.setText("Enter Last Name");

        //---- laddr ----
        laddr.setText("Enter Permanent Address");

        //---- mob ----
        mob.setText("MobileNo");
        //---- adno ----
        adno.setText("Adhaar Number");

        //---- lgender ----
        lgender.setText("Gender");

        //---- ldob ----
        ldob.setText("Date Of Birth");

        //---- occ ----
        occ.setText("Occupation");

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setBackground(new Color(204, 255, 204));
            scrollPane1.setViewportView(textArea1);
        }

        //---- male ----
        male.setText("Male");

        //---- female ----
        female.setText("Female");

        group.add(male);
        group.add(female);

        //---- label1 ----
        //label1.setText("ADD IMAGE");
        label1.setBorder(new BevelBorder(BevelBorder.LOWERED));

        //---- browse ----
        browse.setText("Browse Image");

        //-----Browse Image-----

        browse.addActionListener(this);

        //---- lnation ----
        lnation.setText("Nationality");

        //---- label2 ----
        label2.setText("Password");

        //---- register ----
        register.setText("Register");

        //---- clear ----
        clear.setText("Clear");

        //---- back ----
        back.setText("Back");
        mno.setEditable(false);
        mno.setText("+91" + mnum);
        clear.addActionListener(this);
        register.addActionListener(this);
        back.addActionListener(this);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(register)
                                .addGap(61, 61, 61)
                                .addComponent(clear)
                                .addGap(85, 85, 85)
                                .addComponent(back)
                                .addGap(0, 187, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(lgender, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(label4))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(fn)
                                                        .addComponent(ln)
                                                        .addComponent(laddr)
                                                        .addComponent(ldob)
                                                        .addComponent(occ)
                                                        .addComponent(adno)
                                                        .addComponent(mob)
                                                        .addComponent(lnation, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label2))
                                                .addGap(167, 167, 167)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nationality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ano, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(mno)
                                                        .addComponent(lname)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(female)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(male))
                                                        .addComponent(fname)
                                                        .addComponent(scrollPane1)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(date, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(month, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(year, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                                                        .addComponent(oc, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                        .addComponent(password, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(browse, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(fn)
                                                        .addComponent(fname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ln)
                                                        .addComponent(lname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(laddr)
                                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(browse)
                                                .addGap(0, 148, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(mob)
                                                        .addComponent(mno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(adno)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(label4))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(ano, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24)
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(female)
                                                                        .addComponent(male)
                                                                        .addComponent(lgender))))
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(lnation)
                                                        .addComponent(nationality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(ldob, GroupLayout.Alignment.TRAILING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(month, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(28, 28, 28)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(occ)
                                        .addComponent(oc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label2)
                                        .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(register)
                                        .addComponent(clear)
                                        .addComponent(back))
                                .addGap(20, 20, 20))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == register) {
            try {
                String first_name, last_name, address, mobile_no, adhaar, gender, Nationality, dob, occupation, Password;
                first_name = fname.getText().trim();
                last_name = lname.getText().trim();
                address = textArea1.getText().trim();
                mobile_no = mno.getText().trim();
                adhaar = ano.getText().trim();
                if (female.isSelected()) {
                    gender = "Female";
                } else {
                    gender = "Male";
                }
                Nationality = nationality.getSelectedItem().toString();

                dob = String.format("%s/%s/%s", date.getSelectedItem(), month.getSelectedItem(), year.getSelectedItem()).trim();
                occupation = oc.getText().trim();
                Password = String.valueOf(password.getPassword());
                System.out.println("F Name: " + first_name + "\nL Name : " + last_name + "\nAdd : " + address + "\nMno : " + mobile_no + "\nAdhaa : " + adhaar
                        + "Gener: " + gender + "NAT: " + Nationality + "\nDOB: " + dob + "Occ: " + occupation + "\nPssa: " + Password);
                if (first_name.trim().equals("") || last_name.trim().equals("") || address.trim().equals("") || mobile_no.trim().equals("") || adhaar.trim().equals("") ||
                        Nationality == null || dob.equals("") || occupation.equals("") || password == null || label1 == null) {
                    JOptionPane.showMessageDialog(this, "Please enter all details.");
                } else {
                    JSONObject data = new JSONObject();
                    data.put("code", "502");
                    data.put("fname", first_name);
                    data.put("lname", last_name);
                    data.put("addr", address);
                    data.put("mno", mobile_no);
                    data.put("adhaar", adhaar);
                    data.put("gender", gender);
                    data.put("nationality", Nationality);
                    data.put("dob", dob);
                    data.put("occuption", occupation);
                    data.put("password", Password);
                    data.put("image", iData);
                    data.put("ext", pathImg.substring(pathImg.indexOf(".")));

                    Main.output.println(data.toString());
                    String response = Main.input.readLine();
                    if (response.contains("Failed")) {
                        JOptionPane.showMessageDialog(this, "Server Error");
                    } else {
                        String array[] = response.split(" ");
                        verifyOTP.dispose();
                        new RegisterDialog(this, array[0], array[1]);
                    }

//                    String request = String.format("502 %s %s %s %s %s %s %s %s %s %s", first_name, last_name, address, mobile_no, adhaar, gender, Nationality, dob, occupation, Password);
//                    Main.output.println(request);
//                    String response = Main.input.readLine();
//                    String array[] = response.split(" ");
                }

            } catch (Exception eregister) {
                JOptionPane.showMessageDialog(this, "Could not establish the connection");
                // System.out.println(eregister);
            }
        }
        if (e.getSource() == back) {
            dispose();
            verifyOTP.setVisible(true);
        }
        if (e.getSource() == clear) {
            fname.setText("");
            lname.setText("");
            textArea1.setText("");
            mno.setText("");
            ano.setText("");
//            female.setSelected(false);
//            male.setSelected(false);
            group.clearSelection();
            oc.setText("");
            password.setText("");
            label1.setIcon(null);


        }
        if (e.getSource() == browse) {
            browse_image.setCurrentDirectory(new File(System.getProperty("user.home")));
            browse_image.addChoosableFileFilter(image_extension);
            int result = browse_image.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = browse_image.getSelectedFile();
                pathImg = selectedFile.getAbsolutePath();
                onImage(pathImg);
                label1.setIcon(Main.resizeImage(pathImg, label1.getWidth(), label1.getHeight()));
            } else if (result == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Image not Selected");
                //System.out.println("No File Selected");
            }
        }
    }

    private void onImage(String path) {
        try {
            file = new File(path);
            fstream = new FileInputStream(file);
            imageData = new byte[(int) file.length()];
            fstream.read(imageData);
            iData = encodeImage(imageData);
            fstream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String encodeImage(byte[] imageByteArray) {
        return Base64.getEncoder().encodeToString(imageByteArray);
    }
}
