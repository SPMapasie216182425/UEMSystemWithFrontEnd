/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.frontend.swing;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author kingi
 */
public class LiveClock implements Runnable {

    /**
     * @param args the command line arguments
     */
    private Thread t1 = null;
    private int hours = 0, minutes = 0, seconds = 0;
    private String timeString = "";
    private JLabel label;

    public void DigitalWatch() {
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        try {
            while (true) {
                LocalDateTime currentTime = LocalDateTime.now();
                Month month = currentTime.getMonth();
                int day = currentTime.getDayOfMonth();
                int year = currentTime.getYear();
                DayOfWeek dayOfWeek = currentTime.getDayOfWeek();

                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12) {
                    hours -= 12;
                }
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MMMM/yyyy    HH:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format(date);

                printTime(label);

                t1.sleep(10); // interval given in milliseconds
            }
        } catch (Exception e) {
        }
    }

    public void printTime(JLabel label) {
        this.label = label;
        label.setText(timeString);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LiveClock dt = new LiveClock();
        dt.DigitalWatch();
    }

}
