package pl.camp.it.myhome;

import com.mysql.cj.exceptions.ClosedOnExpiredPasswordException;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.hibernate.cfg.Configuration;


@SpringBootApplication
public class App {


    public static void main(String[] args) {

       SpringApplication.run(App.class, args);
    }
}
