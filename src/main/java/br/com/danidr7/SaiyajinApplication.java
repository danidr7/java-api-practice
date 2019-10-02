package br.com.danidr7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SaiyajinApplication {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("main");
        SpringApplication.run(SaiyajinApplication.class, args);

        logger.info("Service online!");
    }
}
