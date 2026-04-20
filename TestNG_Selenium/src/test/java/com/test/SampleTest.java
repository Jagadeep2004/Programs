package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleTest {
  @Test
  public void b() {
	  System.out.println("Hi");
  }
  @Test
  public void a() {
	  System.out.println("Hello");
  }
  @Test
  public void c() {
	  System.out.println("Bye");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
