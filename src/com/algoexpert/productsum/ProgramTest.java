package com.algoexpert.productsum;

import java.util.*;

import org.junit.Test;

class ProgramTest {
  @Test
  public void TestCase1() {
    List<Object> test =
        new ArrayList<Object>(
            Arrays.asList(
                5,
                2,
                new ArrayList<Object>(Arrays.asList(7, -1)),
                3,
                new ArrayList<Object>(
                    Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
    Utils.assertTrue(Program.productSum(test) == 12);
  }
}
