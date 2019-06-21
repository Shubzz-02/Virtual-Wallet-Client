import org.json.JSONObject;

import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.util.Base64;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sat Dec 01 13:05:10 IST 2018
 */


/**
 * @author Subhash Rawat
 */
public class Profile extends JFrame implements ActionListener {
    public Client_HomePage cl;
    //Profile pprofile;
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
    private JLabel imagelabel;
    private JButton browse;
    private JLabel lnation;
    private JComboBox nationality;
    private JLabel label2;
    private JPasswordField password;
    private JButton edit;
    private JButton deleteAc;
    private JButton save;
    private JButton back;
    private JTextField plus91;
    private JLabel aclabel;
    private JTextField taccno;
    private String acc;
    private JLabel lamount;
    private JTextField amount;
    private String accno;
    //private String country[];

    public Profile(Client_HomePage x, String a) {

        initComponents(a);
        setVisible(true);
        System.out.println("AAAAAAA" + a);
        cl = x;
        accno = a;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static byte[] decodeImage(String imageDataString) {
        return Base64.getDecoder().decode(imageDataString);
    }

    private void createAction(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents(String accno) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Subhash Rawat
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
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        male = new JRadioButton();
        female = new JRadioButton();
        date = new JComboBox(date_arr);
        month = new JComboBox(month_arr);
        year = new JComboBox(year_arr);
        imagelabel = new JLabel();
        browse = new JButton();
        lnation = new JLabel();
        nationality = new JComboBox(country);
        label2 = new JLabel();
        password = new JPasswordField();
        edit = new JButton();
        deleteAc = new JButton();
        save = new JButton();
        back = new JButton();
        plus91 = new JTextField();
        aclabel = new JLabel();
        taccno = new JTextField();
        amount = new JTextField();
        lamount = new JLabel();

        //======== this ========
        setResizable(false);
        setBackground(new Color(0, 193, 202));
        setForeground(Color.black);
        Container contentPane = getContentPane();

        //---- fn ----
        fn.setText("First Name");

        //---- fname ----
        fname.setEditable(false);

        //---- ln ----
        ln.setText("Last Name");

        //---- lname ----
        lname.setEditable(false);

        //---- laddr ----
        laddr.setText("Permanent Address");

        //---- mob ----
        mob.setText("Mobile No");

        //---- adno ----
        adno.setText("Adhaar Number");

        //---- lgender ----
        lgender.setText("Gender");

        //---- ldob ----
        ldob.setText("Date Of Birth");

        //---- occ ----
        occ.setText("Occupation");

        //---- ano ----
        ano.setEditable(false);

        //---- oc ----
        oc.setEditable(false);

        //---- mno ----
        mno.setEditable(false);

        save.setVisible(false);

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setBackground(new Color(204, 255, 204));
            textArea1.setEditable(false);
            scrollPane1.setViewportView(textArea1);
        }

        //---- male ----
        male.setText("Male");
        male.setEnabled(false);

        //---- female ----
        female.setText("Female");
        female.setEnabled(false);

        //---- imagelabel ----
        imagelabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

        //---- browse ----
        browse.setText("Browse Image");
        browse.setVisible(false);

        //---- lnation ----
        lnation.setText("Nationality");

        //---- label2 ----
        label2.setText("Password");

        //---- password ----
        password.setEditable(false);

        //---- edit ----
        edit.setText("Edit");

        //---- deleteAc ----
        deleteAc.setText("Delete Account");

        //---- save ----
        save.setText("Save");

        //---- back ----
        back.setText("Back");

        //---- plus91 ----
        plus91.setText("+91");
        plus91.setEditable(false);
        //---- aclabel ----
        aclabel.setText("ACCOUNT NUMBER: ");
        nationality.setEnabled(false);
        month.setEnabled(false);
        year.setEnabled(false);
        date.setEnabled(false);

        //---- accno ----
        taccno.setEditable(false);
        amount.setEditable(false);
        lamount.setText("Amount:");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
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
                                                                .addGap(191, 191, 191)
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(nationality, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ano)
                                                                        .addComponent(lname, GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                                                                .addComponent(female)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(male))
                                                                        .addComponent(fname, GroupLayout.Alignment.LEADING)
                                                                        .addComponent(scrollPane1, GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                                                                .addComponent(date, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(month, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(year, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                                                                        .addComponent(oc, GroupLayout.Alignment.LEADING)
                                                                        .addComponent(password, GroupLayout.Alignment.LEADING)
                                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                                .addComponent(plus91, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(mno, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                                .addGap(210, 210, 210)
                                                                .addComponent(aclabel, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(taccno, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 62, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                                                .addComponent(save)
                                                .addGap(18, 18, 18)
                                                .addComponent(edit)))
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addComponent(deleteAc)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(back))
                                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup()
                                                        .addComponent(lamount)
                                                        .addComponent(imagelabel, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(amount, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(browse, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(back)
                                        .addComponent(deleteAc)
                                        .addComponent(edit)
                                        .addComponent(save))
                                .addGap(20, 20, 20))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(aclabel)
                                        .addComponent(taccno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
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
                                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(mob)
                                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(browse)
                                                                .addComponent(mno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(plus91, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
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
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(ldob, GroupLayout.Alignment.TRAILING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(month, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(imagelabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(lamount)
                                                .addGap(18, 18, 18)
                                                .addComponent(amount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 109, Short.MAX_VALUE)))
                                .addGap(28, 28, 28)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(occ)
                                        .addComponent(oc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label2)
                                        .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81))
        );
        back.addActionListener(this);
        edit.addActionListener(this);
        save.addActionListener(this);
        browse.addActionListener(this);
        deleteAc.addActionListener(this);
        displayProfile(country, month_arr, year_arr, accno);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            cl.setVisible(true);
            dispose();
        }
        if (e.getSource() == edit) {
            //edit.setText("Cancel");
            fname.setEditable(true);
            lname.setEditable(true);
            textArea1.setEditable(true);
            mno.setEditable(true);
            //ano.setEditable(true);
            female.setEnabled(true);
            male.setEnabled(true);
            nationality.setEnabled(true);
            date.setEnabled(true);
            month.setEnabled(true);
            year.setEnabled(true);
            oc.setEditable(true);
            password.setEditable(true);
            browse.setVisible(true);
            save.setVisible(true);
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);


        }
        if (e.getSource() == save) {
            try {
                String acountno, first_name, last_name, address, mobile_no, adhaar, gender, Nationality, dob, occupation, Password;
                first_name = fname.getText().trim();
                last_name = lname.getText().trim();
                address = textArea1.getText().trim();
                mobile_no = "+91" + mno.getText().trim();
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
                        Nationality == null || dob.equals("") || occupation.equals("") || password == null) {
                    JOptionPane.showMessageDialog(this, "Please fill all details.");
                } else {
                    JSONObject updatedata = new JSONObject();
                    updatedata.put("code", "508");
                    updatedata.put("fname", first_name);
                    updatedata.put("lname", last_name);
                    updatedata.put("addr", address);
                    updatedata.put("mno", mobile_no);
                    updatedata.put("adhaar", adhaar);
                    updatedata.put("gender", gender);
                    updatedata.put("nationality", Nationality);
                    updatedata.put("dob", dob);
                    updatedata.put("occuption", occupation);
                    updatedata.put("password", Password);
                    updatedata.put("accno", accno);
                    System.out.println();


                    Main.output.println(updatedata.toString());
                    String response = Main.input.readLine();
                    if (response.equalsIgnoreCase("Failed")) {
                        JOptionPane.showMessageDialog(this, "Server Down. Try Again Later.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Profile updated successfully");
                        fname.setEditable(false);
                        lname.setEditable(false);
                        textArea1.setEditable(false);
                        mno.setEditable(false);
                        //ano.setEditable(true);
                        female.setEnabled(false);
                        male.setEnabled(false);
                        nationality.setEditable(false);
                        date.setEditable(false);
                        month.setEditable(false);
                        year.setEditable(false);
                        oc.setEditable(false);
                        password.setEditable(false);
                        browse.setVisible(false);
                        save.setVisible(false);
                    }
                }
            } catch (Exception editupdate) {
                JOptionPane.showMessageDialog(this, "Profile not updated successfully");

            }
        }
        if (e.getSource() == deleteAc) {
            try {
                String acno = accno;
                JSONObject delete = new JSONObject();
                delete.put("code", "509");
                delete.put("acno", acno);
                Main.output.println(delete);
                String response = Main.input.readLine();
                if (response.contains("Failed")) {
                    JOptionPane.showMessageDialog(this, "Server Down. Try Again Later.");
                } else {
                    dispose();
                    cl.dispose();
                    JOptionPane.showMessageDialog(this, "YOUR ACCOUNT HAS BEEN SUCCESSFULLY DELETE. GOODBYE :(");
                    new Logingui();
                }
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(this, "ACCOUNT DELETION UNSUCCESSFULL.");
            }

        }
        // JFormDesigner - End of variables declaration  //GEN-END:variables
    }

    private void displayProfile(String c[], String m[], String r[], String accno) {
        try {
            JSONObject response = new JSONObject(Main.input.readLine());
            if (response.getString("code").equals("510")) {
                System.out.println(accno);
                taccno.setText(accno);
                fname.setText(response.getString("cfname"));
                lname.setText(response.getString("clname"));
                oc.setText(response.getString("cocc"));
                password.setText(response.getString("cpassword"));
                amount.setText(response.getString("camount"));
                textArea1.setText(response.getString("caddr"));
                mno.setText(response.getString("cmob").substring(4));
                ano.setText(response.getString("cadhaarno"));
//                onImage(response.getString("image"),"jpg");
                imagelabel.setIcon(onImage(response.getString("image")));
                if (response.getString("cgender").equalsIgnoreCase("Female")) {
                    female.setSelected(true);
                } else {
                    male.setSelected(true);
                }
                for (int i = 0; i < 5; i++) {
                    if (response.getString("cnationality").equals(c[i])) {
                        nationality.setSelectedIndex(i);
                    }
                }
                String ddob[] = response.getString("cdob").split("/");
                date.setSelectedIndex(Integer.parseInt(ddob[0]) - 1);
                for (int i = 0; i < 12; i++) {
                    if (ddob[1].equalsIgnoreCase(m[i])) {
                        month.setSelectedIndex(i);
                    }
                }

                for (int i = 0; i < 31; i++) {
                    if (ddob[2].equalsIgnoreCase(r[i])) {
                        year.setSelectedIndex(i);
                    }
                }

            }


        } catch (Exception e) {

        }
    }

    private ImageIcon onImage(String image) {
        try {
            byte[] imageByte = decodeImage(image);
            return new ImageIcon(imageByte);
            /*FileOutputStream imageOutFile = new FileOutputStream("imagefromclient" + ext);
            imageOutFile.write(imageByte);
            imageOutFile.close();*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
