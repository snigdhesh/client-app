package com.manasni.clientapp;


import com.example.proptest.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan({"com.manasni.*","com.example.*"})
@SpringBootApplication
public class ClientAppApplication implements ApplicationRunner {

  @Autowired
  private UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(ClientAppApplication.class, args);
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }


  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println(userService.getUsers());
  }
}
