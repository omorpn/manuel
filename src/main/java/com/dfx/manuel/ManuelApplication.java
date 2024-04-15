package com.dfx.manuel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ManuelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManuelApplication.class, args);
    }

}
