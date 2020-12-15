package com.toris.user;

import com.toris.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(basePackages = {"com.toris.user.model.entity.hungryBurger"})
public class UserApplication {
    private static final Logger logger = LogManager.getLogger(UserService.class);

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        logPrint();
    }

    public static void logPrint() {
        logger.info("INFO SUCCESS");
        logger.debug("DEBUG SUCCESS");
        logger.error("ERROR SUCCESS");
    }
}
