package org.fai.example.demo_sercurity_jwt;

import org.fai.example.demo_sercurity_jwt.configs.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)

public class DemoSercurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSercurityJwtApplication.class, args);
    }

}
