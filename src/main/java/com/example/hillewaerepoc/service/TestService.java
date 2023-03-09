package com.example.hillewaerepoc.service;

import com.example.hillewaerepoc.domain.Klant;
import com.example.hillewaerepoc.domain.TestObject;
import com.example.hillewaerepoc.repository.TestRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  private final TestRepo repo;

  public TestService(TestRepo repo) {
    this.repo = repo;
  }

  public TestObject findById(String id) {
    return repo.findById(id);
  }

  public List<TestObject> findAll() {
    List<TestObject> output = repo.findAll("parameter-1", "parameter-2");

    String phoneNumber = "";
    List<Klant> klanten = new ArrayList<>();
    klanten = klanten.stream()
        .filter(k -> phoneNumber.equalsIgnoreCase(k.getTelefoon()))
        .collect(Collectors.toList());



    System.out.println(output);
    return output;
  }
}
