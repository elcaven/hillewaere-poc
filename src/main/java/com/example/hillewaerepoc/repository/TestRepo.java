package com.example.hillewaerepoc.repository;

import com.example.hillewaerepoc.domain.TestObject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepo {

  private final Logger logger = LoggerFactory.getLogger(TestRepo.class);

//  @Cacheable(value = "result_by_id", unless = "#result==null")
  public TestObject findById(String id) {
    logger.info("findById - Reading from database");

    if ("error".equals(id)) {
      logger.error("findById - error occurred");
    }

    TestObject object = new TestObject();
    object.setId(UUID.randomUUID().toString());
    object.setName("Test Name");
    return object;
  }

//  @Cacheable(value = "all_results", unless = "#result==null or #result.size()==0")
  public List<TestObject> findAll(String param1, String param2) {
    logger.info("findAll - Reading from database");
    List<TestObject> output = new ArrayList<>();

    TestObject object1 = new TestObject();
    object1.setId(UUID.randomUUID().toString());
    object1.setName("Test Name 1");
    output.add(object1);

    TestObject object2 = new TestObject();
    object2.setId(UUID.randomUUID().toString());
    object2.setName("Test Name 2");
    output.add(object2);

    return output;
  }
}
