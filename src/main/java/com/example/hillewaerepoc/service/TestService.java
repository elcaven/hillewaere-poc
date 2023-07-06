package com.example.hillewaerepoc.service;

import com.example.hillewaerepoc.domain.TestObject;
import com.example.hillewaerepoc.repository.TestRepo;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  private final Logger logger = LoggerFactory.getLogger(TestService.class);

  private final TestRepo repo;

  public TestService(TestRepo repo) {
    this.repo = repo;
  }

  public TestObject findById(String id) {
    return repo.findById(id);
  }

  public List<TestObject> findAll() {
    List<TestObject> output = repo.findAll("parameter-1", "parameter-2");
    logger.info("findAll - Found {} objects", output.size());
    return output;
  }
}
