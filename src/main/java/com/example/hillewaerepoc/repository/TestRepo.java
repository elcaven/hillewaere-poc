package com.example.hillewaerepoc.repository;

import com.example.hillewaerepoc.domain.TestObject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepo {

  @Cacheable(value = "result_by_id", unless = "#result==null")
  public TestObject findById(String id) {
    System.out.println("findById - Reading from database");

    TestObject object = new TestObject();
    object.setId(UUID.randomUUID().toString());
    object.setName("Test Name");
    return object;
  }

  @Cacheable(value = "all_results", unless = "#result==null or #result.size()==0")
  public List<TestObject> findAll(String param1, String param2) {
    System.out.println("findAll - Reading from database");
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
