import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Scanner;

public class OTPHandler extends Thread {
    private String url;

    OTPHandler(String pno, String otp) {

        url = String.format("https://control.msg91.com/api/verifyRequestOTP.php?authkey=249243A7rlMFbL5bfceb1a&mobile=%s&otp=%s", pno, otp);
        System.out.println(url);
    }


    String verifyOTP() {
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            JSONObject myResponse = new JSONObject(response.toString());
            if (myResponse.getString("type").equalsIgnoreCase("success")) {
                return "success";
            } else {
                return "failed";
            }

        } catch (Exception e) {
            System.out.println(("IN EXCEP: " + e.getMessage()));
            return "failed";
        }
    }
}



   /* Scanner s = new Scanner(System.in);
        System.out.print("Enter OTP : ");
                String a = s.nextLine();
                String url = "https://control.msg91.com/api/verifyRequestOTP.php?authkey=249243A7rlMFbL5bfceb1a&mobile=917535053018&otp=" + a;
                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                // optional default is GET
                con.setRequestMethod("GET");
                //add request header
                con.setRequestProperty("User-Agent", "Mozilla/5.0");
                int responseCode = con.getResponseCode();
                System.out.println("\nSending 'POST' request to URL : " + url);
                System.out.println("Response Code : " + responseCode);
                BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
                }
                in.close();
                //print in String
                System.out.println(response.toString());
                //Read JSON response and print
                JSONObject myResponse = new JSONObject(response.toString());
                System.out.println(myResponse.getString("type"));
                if (myResponse.getString("type").equalsIgnoreCase("success")) {
                System.out.println("OTP VERIFIED");
                } else {
                System.out.println("OTP Wrong");
                }*/