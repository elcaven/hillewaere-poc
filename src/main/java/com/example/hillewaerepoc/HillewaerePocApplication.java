package com.example.hillewaerepoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HillewaerePocApplication {

  public static void main(String[] args) {
    SpringApplication.run(HillewaerePocApplication.class, args);
  }

}
