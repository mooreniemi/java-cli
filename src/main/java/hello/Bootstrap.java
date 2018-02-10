package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Need a main method for Spring Shell to attach
 * itself to. A @ComponentScan is done by
 * @SpringBootApplication for you. This is a good
 * resource: https://dzone.com/articles/spring-component-scan
 **/
@SpringBootApplication
public class Bootstrap {
    public static void main(final String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
