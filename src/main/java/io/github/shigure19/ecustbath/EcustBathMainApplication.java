package io.github.shigure19.ecustbath;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.shigure19.ecustbath.entity")
public class EcustBathMainApplication {
    public static void main(String[] args){
        SpringApplication.run(EcustBathMainApplication.class,args);
    }
}

