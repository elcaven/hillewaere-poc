package com.example.hillewaerepoc.rest;

import com.example.hillewaerepoc.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  private final TestService service;

  public TestController(TestService service) {
    this.service = service;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Void> findById(@PathVariable String id) {
    service.findById(id);
    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<Void> findAll() {
    service.findAll();
    return ResponseEntity.ok().build();
  }

}
