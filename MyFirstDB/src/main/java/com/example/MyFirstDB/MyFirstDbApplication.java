package com.example.MyFirstDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyFirstDbApplication {

        @RequestMapping("/")
        public String home(){
            return "Hello word from NetBeans";
        }
    
	public static void main(String[] args) {
		SpringApplication.run(MyFirstDbApplication.class, args);
	}

}
