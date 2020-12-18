package io.ayers.spring_admin_example;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringAdminExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAdminExampleApplication.class, args);
    }

}
