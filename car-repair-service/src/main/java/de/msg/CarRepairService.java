package de.msg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CarRepairService {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CarRepairService.class).web(true).run(args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    //
}