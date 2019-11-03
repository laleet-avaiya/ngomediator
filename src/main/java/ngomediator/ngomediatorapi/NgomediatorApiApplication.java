package ngomediator.ngomediatorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class NgomediatorApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(NgomediatorApiApplication.class, args);
        System.out.println("Connection Start");
    }

}
