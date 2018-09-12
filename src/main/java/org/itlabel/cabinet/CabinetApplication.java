package org.itlabel.cabinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "org.itlabel.cabinet")
@EnableJpaRepositories(basePackages = "org.itlabel.cabinet.repository")
@EntityScan(basePackages = "org.itlabel.cabinet.model")
public class CabinetApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CabinetApplication.class, args);
    }
}
