package za.ac.cput.elective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.ac.cput.frontend.swing.Login;

@SpringBootApplication
public class MainApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainApplication.class, args);
        Login login = new Login();
        login.setVisible(true);
    }
}
