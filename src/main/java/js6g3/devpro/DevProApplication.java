package js6g3.devpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevProApplication {

    public static void main(String[] args) {
                SpringApplication.run(DevProApplication.class, args);
        System.out.println("Spring-Boot приложение, интегрированное с телеграмм-ботом");
    }

}
