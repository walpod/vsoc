package atan.test;

import java.io.StringReader;
import java.util.Set;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import atan.parser.CmdParser;
import atan.parser.CommandFilter;
import atan.parser.Filter;
import atan.parser.ParseException;

public class GeneratedTests extends TestCase {

  private static CmdParser cmdp = null;

  public GeneratedTests(String name) {
    super(name);
  }
  public void test0() {
    String s = "(init l 1 before_kick_off)";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test1() {
    String s = "(init l 2 before_kick_off)";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test2() {
    String s = "(init l 3 before_kick_off)";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test3() {
    String s = "(init r 8 before_kick_off)";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test4() {
    String s = "(init r 10 before_kick_off)";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test5() {
    String s = "(init r 9 before_kick_off)";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test6() {
    String s = "(init r 11 before_kick_off)";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test7() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0 0 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test8() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test9() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test10() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test11() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test12() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test13() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test14() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test15() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test16() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test17() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test18() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test19() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test20() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test21() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test22() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test23() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test24() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test25() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test26() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test27() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test28() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test29() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test30() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test31() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test32() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test33() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test34() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test35() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test36() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test37() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test38() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test39() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test40() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test41() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test42() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test43() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test44() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test45() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test46() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test47() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test48() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test49() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test50() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test51() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0 0 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test52() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test53() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test54() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test55() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test56() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test57() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0 0 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test58() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test59() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test60() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test61() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test62() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test63() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test64() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test65() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test66() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test67() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test68() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test69() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test70() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test71() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test72() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test73() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0 0 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test74() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test75() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test76() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test77() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test78() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test79() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0 0 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test80() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test81() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test82() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test83() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test84() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test85() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test86() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test87() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test88() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test89() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test90() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test91() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test92() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test93() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test94() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test95() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test96() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test97() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test98() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test99() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test100() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test101() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test102() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test103() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test104() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test105() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test106() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test107() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test108() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test109() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test110() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test111() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test112() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test113() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test114() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test115() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test116() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test117() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test118() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test119() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test120() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test121() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test122() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test123() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test124() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0 0 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test125() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test126() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test127() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test128() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test129() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test130() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test131() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test132() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test133() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test134() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test135() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test136() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test137() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test138() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test139() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0 0 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test140() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test141() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test142() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test143() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test144() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test145() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test146() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test147() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0 0 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test148() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test149() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test150() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test151() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test152() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test153() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test154() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test155() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test156() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test157() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test158() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test159() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test160() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test161() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test162() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test163() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test164() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test165() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test166() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test167() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test168() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test169() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test170() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test171() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test172() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test173() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test174() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test175() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test176() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test177() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test178() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test179() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test180() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test181() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test182() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test183() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test184() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test185() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test186() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test187() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test188() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test189() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0 0 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test190() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test191() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test192() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test193() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test194() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test195() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test196() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test197() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test198() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test199() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test200() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test201() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test202() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test203() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test204() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test205() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test206() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test207() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test208() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test209() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test210() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0 0 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test211() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test212() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test213() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test214() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0 0 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test215() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test216() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test217() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test218() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test219() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test220() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test221() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test222() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test223() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test224() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test225() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test226() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test227() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test228() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test229() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test230() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test231() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test232() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test233() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test234() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test235() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test236() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test237() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test238() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test239() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0 0 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test240() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test241() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test242() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test243() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test244() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test245() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test246() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test247() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test248() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test249() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test250() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test251() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test252() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test253() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test254() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test255() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test256() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test257() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test258() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test259() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test260() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test261() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test262() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test263() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test264() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test265() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test266() {
    String s = "(see 0 ((goal r) 20.7 0) ((flag p r c) 4.2 0 -0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.2 0 0 0) ((player B 5) 1.8 0 0 0) ((player B 6) 1.8 0 0 0) ((player B 8) 0.6 0 0 0) ((player B 9) 1.2 0 0 0) ((player B 10) 1.8 0 0 0) ((player B 11) 2.5 0 0 0) ((line r) 20.7 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test267() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test268() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 4) nan 0 0 0) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test269() {
    String s = "(see 0 ((goal r) 20.1 0) ((flag p r c) 3.6 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((player B 4) 0.6 0 0 0) ((player B 5) 1.2 0 0 0) ((player B 6) 1.2 0 0 0) ((Player) 0.6 179) ((player B 9) 0.6 0 0 0) ((player B 10) 1.2 0 0 0) ((player B 11) 1.8 0 0 0) ((line r) 20.1 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test270() {
    String s = "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test271() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test272() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test273() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test274() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test275() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0) ((Player) 1.2 179) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 8) nan 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test276() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test277() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 6) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test278() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 11) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test279() {
    String s = "(see 0 ((goal r) 80.6 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 67.4 -17) ((flag p r c) 64.1 0) ((flag p r b) 67.4 17) ((ball) 27.1 0 0 0) ((Player) 1.8 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 1.2 179) ((player A 7) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 1.2 179) ((Player) 1.2 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 80.6 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test280() {
    String s = "(see 0 ((goal r) 21.3 0) ((flag p r c) 4.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 4) 1.8 0 0 0) ((player B 5) 2.5 0 0 0) ((player B 6) 2.5 0 0 0) ((player B 7) 0.6 0 0 0) ((player B 8) 1.2 0 0 0) ((player B 9) 1.8 0 0 0) ((player B 10) 2.5 0 0 0) ((player B 11) 3 0 0 0) ((line r) 21.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test281() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -17) ((flag p r c) 65.4 0) ((flag p r b) 68.7 17) ((ball) 30 0 0 0) ((Player) 0.6 179) ((player A 2) 0.6 0 0 0) ((player A 3) 0.6 0 0 0) ((player A 4) 0.6 0 0 0) ((player A 5) 0.6 0 0 0) ((player A 6) nan 0 0 0) ((player A 7) 1.8 0 0 0) ((player A 8) 0.6 0 0 0) ((player A 9) 1.2 0 0 0) ((player A 10) nan 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test282() {
    String s = "(see 0 ((goal r) 18.9 0) ((flag p r c) 2.4 0 -0 0) ((Player) 2.5 179) ((Player) 0.6 179) ((player B 5) nan 0 0 0) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 10) nan 0 0 0) ((player B 11) 0.6 0 0 0) ((line r) 18.9 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test283() {
    String s = "(see 0 ((goal r) 19.5 0) ((flag p r c) 3 0 -0 0) ((Player) 2.5 179) ((Player) 1.8 179) ((player B 5) 0.6 0 0 0) ((player B 6) 0.6 0 0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((player B 9) nan 0 0 0) ((player B 10) 0.6 0 0 0) ((player B 11) 1.2 0 0 0) ((line r) 19.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test284() {
    String s = "(see 0 ((goal r) 22 0) ((flag p r c) 5.4 0 -0 0) ((Player) 0.6 179) ((player B 3) 0.6 0 0 0) ((player B 4) 2.5 0 0 0) ((player B 5) 3 0 0 0) ((player B 6) 3 0 0 0) ((player B 7) 1.2 0 0 0) ((player B 8) 1.8 0 0 0) ((player B 9) 2.5 0 0 0) ((player B 10) 3 0 0 0) ((player B 11) 3.7 0 0 0) ((line r) 22 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test285() {
    String s = "(see 0 ((goal r) 81.5 0) ((flag r t) 88.2 -22) ((flag r b) 88.2 22) ((flag p r t) 68 -17) ((flag p r c) 64.7 0) ((flag p r b) 68 17) ((ball) 30 0 0 0) ((Player) 1.2 179) ((player A 2) nan 0 0 0) ((player A 3) nan 0 0 0) ((player A 4) nan 0 0 0) ((player A 5) nan 0 0 0) ((Player) 0.6 179) ((player A 7) 1.2 0 0 0) ((player A 9) 0.6 0 0 0) ((Player) 0.6 179) ((Player) 0.6 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 81.5 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test286() {
    String s = "(see 0 ((goal r) 79.8 0) ((flag r t) 87.4 -22) ((flag r b) 87.4 22) ((flag p r t) 66.7 -17) ((flag p r c) 63.4 0) ((flag p r b) 66.7 17) ((ball) 27.1 0) ((Player) 2.5 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.2 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 1.8 179) ((Player) 1.8 179) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((line r) 79.8 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test287() {
    String s = "(see 0 ((goal r) 22.4 0) ((flag p r c) 6 0 -0 0) ((player B 2) 0.6 0 0 0) ((player B 3) 1.2 0 0 0) ((player B 4) 3 0 0 0) ((player B 5) 3.7 0 0 0) ((player B 6) 3.7 0 0 0) ((player B 7) 1.8 0 0 0) ((player B 8) 2.5 0 0 0) ((player B 9) 3 0 0 0) ((player B 10) 3.7 0 0 0) ((player B 11) 4.1 0 0 0) ((line r) 22.4 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test288() {
    String s = "(see 80 ((goal r) 84.8 18) ((flag c t) 46.5 -28) ((flag r t) 90.9 -3) ((flag r b) 91.8 40) ((flag p r t) 70.8 1) ((flag p r c) 68 18) ((flag p r b) 71.5 34) ((ball) 33.1 18) ((Player) 2.2 139) ((Player) 2 83) ((Player) 1.8 -128) ((Player) 2.7 168) ((Player) 2.2 -165) ((player) 60.3 16) ((player) 60.3 15) ((player) 60.3 19) ((player) 60.3 17) ((player) 66.7 16) ((player) 60.3 20) ((player) 66.7 17) ((player) 60.3 18) ((player) 60.3 18) ((player) 60.3 21) ((player) 66.7 21) ((line r) 89.1 -72))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test289() {
    String s = "(see 80 ((goal r) 88.2 40) ((flag c t) 48.4 -3) ((flag r t) 93.7 19) ((Flag) 1.1 155) ((flag p r t) 73.7 24) ((flag p r c) 71.5 40) ((ball) 36.6 41 -0 0.1) ((player A 6) 1.8 17 -0.108 -2.9) ((Player) 2 106) ((Player) 1.1 65) ((player) 66.7 38) ((player) 66.7 37) ((player) 60.3 41) ((player) 66.7 39) ((player) 66.7 38) ((player) 66.7 42) ((player) 73.7 39) ((player) 60.3 40) ((player) 66.7 40) ((player) 66.7 43) ((player) 66.7 43) ((line t) 51.9 39))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test290() {
    String s = "(see 80 ((flag l t) 40.9 -7) ((flag p l t) 21.8 11 -0 0) ((Player) 2 -70) ((Player) 2.2 -92) ((player A 4) 2 -1 -0.08 0.3) ((player A 5) 4.5 -38 -0.09 0.4) ((player A 6) 3.7 -16 0 0) ((Player) 1.2 -159) ((Player) 1.8 -168) ((player A 11) 3.3 -38 -0.066 -0.8) ((line t) 38.1 -67))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test291() {
    String s = "(see 80 ((goal r) 86.5 41) ((flag c t) 49.4 -4) ((flag r t) 93.7 19) ((flag p r t) 73 24) ((flag p r c) 69.4 40) ((ball) 33.1 38) ((player A 1) 0.9 -39 0.072 -4.5) ((player A 2) 2.2 16 0 -2) ((player A 4) 3 -22 0 0.1) ((Player) 2.2 50) ((Player) 2.5 61) ((Player) 1.8 -88) ((Player) 2.7 -66) ((player) 60.3 38) ((player) 60.3 37) ((player) 60.3 41) ((player) 60.3 39) ((player) 66.7 38) ((player) 60.3 42) ((player) 66.7 39) ((player) 60.3 39) ((player) 66.7 40) ((player) 60.3 43) ((player) 66.7 43) ((line t) 53.5 42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test292() {
    String s = "(see 80 ((flag l t) 37.3 -4) ((flag p l t) 18.5 18 -0 0.1) ((Flag) 2.7 -102) ((Player) 3 -162) ((Player) 1.8 149) ((Player) 1.8 -86) ((Player) 2.7 -134) ((Player) 1.3 -127) ((line t) 35.9 -64))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test293() {
    String s = "(see 80 ((flag c t) 48.4 21) ((flag p l t) 23.6 -30 0 0) ((Player) 2.7 -72) ((player A 2) 1.8 -29 0.072 -0.2) ((Player) 2.5 -89) ((player A 4) 3.7 -36 0 0.3) ((Player) 1.8 116) ((Player) 0.6 -48) ((line t) 38.9 71))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test294() {
    String s = "(see 80 ((flag c t) 49.4 -9) ((flag l t) 91.8 -35) ((flag p l t) 71.5 -40) ((flag p r t) 24.5 40 -0 0) ((player B 1) 6.7 5 0 0.2) ((player B 2) 7.4 15 0 0.1) ((player B 3) 5 -32 -0 0.2) ((player B 4) 6 4 0 0.8) ((player B 5) 6.7 44 0 0.2) ((player B 6) 2.5 -22 -0 0.4) ((player B 8) 7.4 -24 0 0.2) ((player B 9) 3.7 18 0.074 0.1) ((player B 10) 2 -38 -0 -0.1) ((line t) 43.8 -59))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test295() {
    String s = "(see 80 ((goal l) 23.1 -40) ((flag l t) 44.3 8) ((flag p l t) 25.3 24 -0 0.1) ((flag p l c) 7.5 -16 -0.15 -0.2) ((player A 1) 4.5 -11 0 0.1) ((player A 2) 3.7 10 -0 0.5) ((player A 3) 4.5 -21 -0.09 -0.5) ((player A 4) 5.5 12 -0.11 0.4) ((player A 5) 7.4 -8 -0.148 0.6) ((player A 6) 7.4 4 0 0.2) ((player A 8) 2.5 -2 -0.1 -0.1) ((player A 9) 1.8 -6 -0.108 -0.6) ((player A 10) 6 -15 -0.12 -0.1) ((player A 11) 6.7 -5 -0.134 -0) ((line l) 35.9 39))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test296() {
    String s = "(see 80 ((flag r t) 40 11) ((flag p r t) 20.1 -3 -0 -0) ((Player) 0.7 -47) ((player B 2) 2 -7 -0.08 -0.5) ((Player) 2.5 110) ((line t) 35.9 65))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test297() {
    String s = "(see 80 ((goal r) 87.4 38) ((flag c t) 48.9 -5) ((flag r t) 93.7 17) ((Flag) 1.5 -109) ((flag p r t) 73.7 22) ((flag p r c) 70.8 38) ((ball) 33.1 37) ((Player) 1.3 60) ((Player) 1.8 88) ((player A 4) 2.7 9 0 0.2) ((Player) 2 -73) ((player A 6) 2.7 -30 0.054 -1.8) ((player A 11) 1.3 -38 -0 -0.1) ((player) 66.7 36) ((player) 66.7 35) ((player) 60.3 39) ((player) 66.7 37) ((player) 66.7 36) ((player) 66.7 40) ((player) 66.7 37) ((player) 60.3 38) ((player) 66.7 38) ((player) 66.7 41) ((player) 66.7 41) ((line t) 55.1 39))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test298() {
    String s = "(see 80 ((goal r) 83.9 18) ((flag c t) 47.9 -29) ((flag r t) 91.8 -3) ((flag r b) 90 40) ((flag p r t) 70.8 1) ((flag p r c) 67.4 17) ((flag p r b) 69.4 34) ((ball) 33.1 15 -0 0) ((Player) 2.2 -130) ((Player) 1.2 -72) ((Player) 2.2 -152) ((Player) 2.5 68) ((Player) 0.6 80) ((player) 60.3 15) ((player) 60.3 14) ((player) 60.3 19) ((player) 60.3 16) ((player) 66.7 15) ((player) 60.3 19) ((player) 66.7 17) ((player) 54.6 17) ((player) 60.3 18) ((player) 60.3 20) ((player) 60.3 21) ((line r) 89.1 -70))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test299() {
    String s = "(see 80 ((goal r) 19.5 -8) ((flag p r c) 3.8 24 -0 0.2) ((player B 7) 2.2 25 0 0.3) ((line r) 20.1 74))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test300() {
    String s = "(see 80 ((flag r t) 42.9 -5) ((flag p r t) 22.4 -16 -0 0) ((player B 1) 3.7 18 0 0.1) ((player B 2) 5 9 -0 0) ((Player) 2.5 98) ((player B 4) 3.7 29 0.074 -0.8) ((player B 5) 8.2 30 0 0.1) ((player B 7) 9 41 0 0.2) ((line r) 38.5 -44))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test301() {
    String s = "(see 80 ((flag c t) 46.1 -27) ((flag p r t) 21.1 28 -0 0.1) ((player B 1) 3 -26 -0.06 -0.5) ((player B 2) 4.1 -2 -0.082 0) ((player B 4) 2.5 -31 -0.05 1) ((Player) 2.5 -136) ((line t) 35.5 -75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test302() {
    String s = "(see 80 ((goal r) 25.5 41) ((flag r t) 43.8 -8) ((flag p r t) 23.6 -22 -0 0) ((flag p r c) 9.1 35 -0 0.1) ((player B 1) 4.1 -17 0 0.1) ((player B 2) 5.5 -16 0 -0) ((player B 4) 3.7 -9 0.074 -0.2) ((player B 5) 7.4 12 0 0.1) ((Player) 2.7 64) ((player B 7) 8.2 26 0 0.2) ((Player) 2.5 -81) ((player B 9) 4.1 27 0 -1.1) ((line r) 36.2 -44))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test303() {
    String s = "(see 80 ((goal r) 17.8 -44) ((flag r b) 39.3 15) ((flag p r c) 1.7 -9 -0 0.1) ((flag p r b) 21.3 38 -0 0) ((Player) 2.2 173) ((line r) 26.6 42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test304() {
    String s = "(see 80 ((flag r t) 43.8 -5) ((flag p r t) 24 -21 0 -0) ((flag p r c) 7.1 27 0 -0) ((player B 2) 6.7 -36 0 0) ((player B 4) 4.5 -44 0.09 0.6) ((player B 5) 6.7 -4 0 0.1) ((player B 6) 0.7 -40 0.014 0.9) ((player B 7) 6.7 13 0 0.1) ((player B 9) 3 -14 0.06 -1) ((Player) 2 74) ((line r) 38.1 -36))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test305() {
    String s = "(see 80 ((flag r t) 38.1 -12) ((flag p r t) 18 -28 -0 0) ((Player) 1.6 162) ((Player) 2 147) ((line r) 30.3 -49))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test306() {
    String s = "(see 80 ((goal r) 87.4 43) ((flag c t) 47.9 -1) ((flag r t) 92.8 21) ((Flag) 1.6 -155) ((flag p r t) 73 27) ((flag p r c) 70.8 43) ((ball) 33.1 43) ((Player) 2 103) ((Player) 2.7 114) ((player A 4) 2.2 39 0 -0.1) ((Player) 1.1 -110) ((player A 6) 1.3 -19 0.052 -3.8) ((Player) 1.3 145) ((player) 60.3 41) ((player) 66.7 40) ((player) 60.3 44) ((player) 66.7 42) ((player) 66.7 41) ((player) 66.7 42) ((player) 60.3 43) ((player) 66.7 43) ((line t) 48.9 43))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test307() {
    String s = "(see 80 ((goal r) 23.1 7) ((flag r t) 42.9 -44) ((flag p r c) 6.9 -7 -0 0) ((Player) 2.7 -147) ((player B 5) 6 -40 0 0.1) ((player B 7) 6 -20 -0 0.1) ((Player) 2.5 -47) ((Player) 0.7 99) ((Player) 2.5 49) ((line r) 23.6 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test308() {
    String s = "(see 80 ((goal r) 23.8 32) ((flag r t) 40 -25) ((flag p r t) 19.5 -40 -0 -0) ((flag p r c) 7.5 43 -0 0.1) ((player B 2) 1.6 -29 -0 -0.2) ((Player) 0.7 95) ((player B 5) 4.5 22 0 0.1) ((player B 7) 6 37 0 0.2) ((line r) 26.8 -61))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test309() {
    String s = "(see 81 ((goal r) 86.5 40) ((flag c t) 49.4 -4) ((flag r t) 93.7 19) ((flag p r t) 73 24) ((flag p r c) 69.4 40) ((ball) 33.1 38 0 -0) ((player A 1) 0.9 -43 0.036 -1.3) ((player A 2) 2.2 14 0 -0.8) ((player A 4) 3.7 -15 0.222 2.6) ((player A 8) 2.7 44 0.216 -1.9) ((Player) 2.5 61) ((Player) 1.8 -68) ((player) 60.3 38) ((player) 66.7 37) ((player) 60.3 41) ((player) 60.3 39) ((player) 66.7 38) ((player) 66.7 42) ((player) 66.7 39) ((player) 60.3 39) ((player) 66.7 40) ((player) 60.3 43) ((player) 66.7 43) ((line t) 53.5 42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test310() {
    String s = "(see 81 ((flag l t) 40 -26) ((flag p l t) 21.5 -4 -0 0) ((Flag) 2.8 -62) ((Player) 2 88) ((Player) 0.9 -173) ((player A 4) 2.7 43 0.216 3.3) ((player A 5) 3 -38 -0.06 0.7) ((player A 6) 3 -5 0 0) ((Player) 2.7 113) ((Player) 3 129) ((player A 10) 1.1 -41 -0.088 12.7) ((player A 11) 2.2 -11 0.088 5.8) ((line t) 35.2 -87))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test311() {
    String s = "(see 81 ((goal r) 88.2 10) ((flag c t) 48.4 -32) ((flag r t) 93.7 -10) ((flag r b) 94.6 31) ((Flag) 1.2 128) ((flag p r t) 73.7 -4) ((flag p r c) 71.5 11) ((flag p r b) 74.4 26) ((ball) 36.6 11 -0 0) ((Player) 3 59) ((player A 2) 4.5 38 -0 0.2) ((player A 4) 3.7 13 0.222 -1.2) ((player A 6) 1.6 -15 -0.032 -1.3) ((Player) 2 61) ((player A 11) 1.3 15 0.13 -6.8) ((player) 66.7 9) ((player) 66.7 8) ((player) 60.3 12) ((player) 66.7 9) ((player) 66.7 9) ((player) 66.7 13) ((player) 73.7 10) ((player) 60.3 10) ((player) 66.7 11) ((player) 66.7 13) ((player) 66.7 13) ((line r) 89.1 -79))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test312() {
    String s = "(see 81 ((flag c t) 47 35) ((flag l t) 40.9 -37) ((flag p l t) 21.8 -18 -0 0) ((Player) 2 -100) ((Player) 2.2 -124) ((player A 4) 2 -10 0.04 7.9) ((Player) 1.3 143) ((Player) 2 161) ((Player) 2.7 -83) ((line t) 35.2 83))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test313() {
    String s = "(see 81 ((goal r) 83.9 18) ((flag c t) 45.6 -28) ((flag r t) 90 -3) ((flag r b) 90.9 40) ((flag p r t) 70.1 1) ((flag p r c) 67.4 18) ((flag p r b) 70.8 35) ((ball) 33.1 19) ((Player) 2.7 149) ((Player) 2 103) ((Player) 2.5 -139) ((Player) 3 170) ((Player) 2.5 -160) ((player) 60.3 16) ((player) 60.3 15) ((player) 60.3 20) ((player) 60.3 17) ((player) 66.7 16) ((player) 60.3 20) ((player) 66.7 17) ((player) 60.3 17) ((player) 60.3 18) ((player) 60.3 21) ((player) 60.3 21) ((line r) 88.2 -72))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test314() {
    String s = "(see 81 ((flag c t) 46.5 41) ((flag l t) 37.3 -34) ((flag p l t) 18.5 -11 -0 0) ((Flag) 2.8 -135) ((Player) 2.5 107) ((Player) 1.6 -119) ((Player) 2.2 -176) ((Player) 0.9 -175) ((line t) 32.5 85))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test315() {
    String s = "(see 82 ((flag r t) 40.4 15) ((flag p r t) 21.1 -2 -0 0) ((player B 1) 3 -40 0 2) ((player B 2) 4.1 -25 0.082 3.1) ((Player) 2.5 -61) ((player B 5) 4.1 35 0.082 1.2) ((Player) 2 173) ((Player) 2.5 -179) ((Player) 3 157) ((line t) 35.9 72))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test316() {
    String s = "(see 82 ((goal r) 83.9 29) ((flag c t) 48.4 -18) ((flag r t) 91.8 7) ((flag p r t) 70.8 12) ((flag p r c) 67.4 28) ((ball) 30 25) ((Player) 3 -111) ((Player) 2 -70) ((Player) 2.5 -116) ((Player) 1.6 75) ((player A 8) 1 -27 0.08 3.9) ((player) 60.3 26) ((player) 60.3 24) ((player) 60.3 29) ((player) 60.3 26) ((player) 66.7 26) ((player) 60.3 30) ((player) 66.7 28) ((player) 54.6 27) ((player) 60.3 28) ((player) 60.3 30) ((player) 60.3 31) ((line t) 71.5 31))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test317() {
    String s = "(see 82 ((goal r) 22.2 7) ((flag p r c) 6 -7 -0.12 -0) ((player B 5) 5.5 -37 -0 0.3) ((player B 7) 5.5 -16 -0.11 2.4) ((Player) 2 -66) ((Player) 0.7 141) ((Player) 1.2 69) ((line r) 22.6 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test318() {
    String s = "(see 82 ((goal r) 23.6 39) ((flag r t) 40 -18) ((flag p r t) 19.9 -34 -0 -0) ((player B 1) 1.1 -27 0.088 2.8) ((player B 2) 2.5 -29 0.2 2.8) ((player B 5) 5 27 0.1 0.6) ((player B 7) 6 44 0.12 1.8) ((Player) 2.5 81) ((line r) 28.8 -54))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test319() {
    String s = "(see 82 ((goal r) 83.1 18) ((flag c t) 47.5 -29) ((flag r t) 90.9 -3) ((flag r b) 89.1 40) ((flag p r t) 70.1 1) ((flag p r c) 66.7 18) ((flag p r b) 68.7 35) ((ball) 30 16 -0 0) ((Player) 1.3 -109) ((Player) 2.5 -149) ((Player) 2.2 90) ((Player) 1 141) ((player) 60.3 15) ((player) 60.3 14) ((player) 60.3 18) ((player) 60.3 16) ((player) 66.7 16) ((player) 60.3 20) ((player) 66.7 17) ((player) 54.6 16) ((player) 60.3 18) ((player) 60.3 20) ((player) 60.3 20) ((line r) 88.2 -70))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test320() {
    String s = "(see 82 ((flag r t) 42.1 -5) ((flag p r t) 21.5 -17 -0 -0.1) ((player B 1) 3.7 22 0 0.3) ((player B 2) 5 10 0.2 0.2) ((Player) 2.5 103) ((player B 4) 3 35 -0.06 0.8) ((player B 5) 8.2 36 0 0.7) ((line r) 37.7 -44))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test321() {
    String s = "(see 82 ((flag r b) 38.9 15) ((flag p r c) 1.1 -17 -0.242 -4.9) ((flag p r b) 20.7 39 -0 0.4) ((Player) 2 -173) ((line r) 26 42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test322() {
    String s = "(see 82 ((goal r) 86.5 38) ((flag c t) 48.4 -6) ((flag r t) 92.8 17) ((Flag) 2 -133) ((flag p r t) 73 22) ((flag p r c) 70.1 38) ((ball) 33.1 38 -0 0.1) ((Player) 1 100) ((Player) 2.5 56) ((Player) 1.6 98) ((player A 4) 3 13 -0 0.3) ((Player) 2 -96) ((Player) 2 -48) ((player A 11) 1.3 -44 0 -0.7) ((player) 66.7 36) ((player) 66.7 35) ((player) 60.3 39) ((player) 60.3 37) ((player) 66.7 37) ((player) 66.7 40) ((player) 66.7 38) ((player) 60.3 37) ((player) 66.7 39) ((player) 66.7 41) ((player) 66.7 41) ((line t) 54.1 39))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test323() {
    String s = "(see 82 ((goal r) 86.5 43) ((flag c t) 47 -1) ((flag r t) 92.8 22) ((Flag) 2.4 -164) ((flag p r t) 72.2 27) ((flag p r c) 70.1 43) ((ball) 33.1 44) ((Player) 2.2 125) ((Player) 3 119) ((Player) 2.5 46) ((Player) 1.5 -138) ((Player) 0.7 -52) ((Player) 1.3 139) ((player) 60.3 41) ((player) 66.7 40) ((player) 60.3 42) ((player) 66.7 42) ((player) 66.7 43) ((player) 60.3 43) ((player) 66.7 44) ((line t) 47.9 43))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test324() {
    String s = "(see 82 ((flag l t) 44.3 -21) ((flag p l t) 25 -4) ((player A 1) 4.5 -41 -0 0) ((player A 2) 3.7 -18 -0 0.1) ((player A 3) 4.1 -43 -0 3.4) ((player A 4) 5.5 -7 0 1.2) ((player A 5) 7.4 -36 -0 0.1) ((player A 6) 7.4 -24 0 0) ((player A 8) 2.2 -10 -0 2.8) ((player A 9) 1.6 -36 -0 -0.1) ((player A 10) 5.5 -37 -0 1.1) ((player A 11) 6.7 -27 0 0.9) ((line t) 38.5 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test325() {
    String s = "(see 82 ((goal r) 25 42) ((flag r t) 42.9 -9) ((flag p r t) 22.9 -22 -0 -0.2) ((flag p r c) 8.7 38 -0.174 0.9) ((player B 1) 4.1 -13 -0.164 -0.1) ((player B 2) 5.5 -15 -0 0.4) ((player B 4) 3 -11 -0.18 -0.9) ((player B 5) 7.4 18 -0.148 1.1) ((player B 7) 8.2 33 -0.164 2.6) ((Player) 2.5 -76) ((player B 9) 3.3 30 -0.198 1.8) ((Player) 3 76) ((line r) 35.9 -44))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test326() {
    String s = "(see 82 ((goal r) 18.7 -8) ((flag p r c) 3 30 -0.06 0.9) ((player B 7) 2 39 0.16 1.3) ((line r) 19.3 74))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test327() {
    String s = "(see 82 ((flag r t) 37.7 -12) ((flag p r t) 17.5 -29 -0.35 -0.5) ((Player) 1.3 154) ((Player) 2.5 155) ((line r) 29.4 -49))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test328() {
    String s = "(see 82 ((flag r t) 42.9 -5) ((flag p r t) 23.6 -22 -0 -0.2) ((flag p r c) 6.6 29 -0.264 1) ((player B 1) 5 -41 -0.1 -0.7) ((player B 2) 6.7 -35 -0 0.6) ((Player) 3 -95) ((player B 5) 6 2 -0.24 0.8) ((player B 6) 0.7 1 -0.154 5.2) ((player B 7) 6 20 -0.24 3.1) ((player B 9) 2.5 -19 -0.2 -1.9) ((Player) 1.2 77) ((line r) 37.3 -36))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test329() {
    String s = "(see 82 ((goal r) 23.1 34) ((flag r t) 38.9 -25) ((flag p r t) 18.9 -41 -0 -0.2) ((player B 2) 1.3 -38 0.104 2.9) ((Player) 1.1 145) ((player B 5) 4.5 31 0 1.1) ((Player) 3 94) ((line r) 26 -61))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test330() {
    String s = "(see 82 ((flag c t) 48.4 -9) ((flag l t) 91.8 -35) ((flag p l t) 70.8 -40) ((flag p r t) 23.8 42 -0 0.2) ((player B 1) 6 15 -0 1.3) ((player B 2) 6.7 23 0 2.1) ((player B 3) 4.1 -30 -0.164 2.5) ((player B 4) 5 7 -0.1 0.3) ((player B 6) 1.2 -3 -0.12 4.6) ((player B 8) 6.7 -19 -0.134 0.5) ((player B 9) 3 24 -0.06 0.9) ((player B 10) 1.2 -35 -0.144 8.5) ((line t) 42.9 -59))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test331() {
    String s = "(see 83 ((flag c t) 46.5 42) ((flag l t) 36.6 -35) ((flag p l t) 17.8 -11 -0.356 -0.2) ((Player) 3 114) ((Player) 1.5 -144) ((Player) 2.7 178) ((Player) 1.2 171) ((line t) 31.8 85))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test332() {
    String s = "(see 83 ((goal r) 85.6 41) ((flag c t) 48.4 -4) ((flag r t) 92.8 19) ((flag p r t) 72.2 25) ((flag p r c) 68.7 41) ((ball) 33.1 39 -0 0.1) ((Player) 1 -77) ((player A 2) 2 7 0.08 -4.9) ((player A 4) 3 -13 -0.06 0.3) ((Player) 2.5 56) ((Player) 2.7 69) ((Player) 1.5 -86) ((Player) 2.7 -63) ((player) 60.3 38) ((player) 66.7 37) ((player) 60.3 41) ((player) 60.3 39) ((player) 66.7 39) ((player) 66.7 43) ((player) 66.7 40) ((player) 60.3 39) ((player) 66.7 40) ((player) 60.3 43) ((player) 66.7 43) ((line t) 52.5 42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test333() {
    String s = "(see 83 ((goal r) 83.9 -10) ((flag c b) 47 36) ((flag r t) 90 -32) ((flag r b) 90.9 11) ((flag p r t) 70.1 -27) ((flag p r c) 67.4 -10) ((flag p r b) 70.8 6) ((ball) 30 -9 -0 0) ((Player) 2.7 131) ((Player) 1.5 83) ((Player) 3 -162) ((Player) 3 142) ((Player) 2.5 172) ((player) 60.3 -12) ((player) 60.3 -13) ((player) 60.3 -9) ((player) 60.3 -12) ((player) 66.7 -12) ((player) 60.3 -8) ((player) 66.7 -10) ((player) 60.3 -11) ((player) 60.3 -10) ((player) 60.3 -7) ((player) 60.3 -7) ((line r) 85.6 78))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test334() {
    String s = "(see 83 ((goal r) 87.4 11) ((flag c t) 47.9 -33) ((flag r t) 93.7 -10) ((flag r b) 94.6 32) ((Flag) 1.7 142) ((flag p r t) 73.7 -4) ((flag p r c) 70.8 11) ((flag p r b) 73.7 27) ((ball) 36.6 12) ((Player) 2.2 64) ((player A 2) 3.7 35 -0.222 -1.6) ((player A 4) 3.7 13 -0.148 0.8) ((player A 6) 1.5 -39 0 -9.8) ((Player) 1.8 71) ((player A 11) 1.1 12 -0.198 2.2) ((player) 66.7 9) ((player) 66.7 7) ((player) 60.3 12) ((player) 66.7 9) ((player) 66.7 9) ((player) 66.7 13) ((player) 66.7 10) ((player) 60.3 10) ((player) 66.7 10) ((player) 66.7 13) ((player) 66.7 13) ((line r) 89.1 -79))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test335() {
    String s = "(see 83 ((flag c t) 46.5 35) ((flag l t) 40.4 -38) ((flag p l t) 21.1 -19 -0.422 -0.3) ((Player) 2 -103) ((Player) 2 -131) ((player A 4) 1.5 -1 -0.24 0.7) ((Player) 2 145) ((Player) 2.5 153) ((Player) 2.5 -94) ((Player) 2.7 -62) ((line t) 34.5 83))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test336() {
    String s = "(see 83 ((flag l t) 39.6 -26) ((flag p l t) 20.9 -4 0 0) ((Flag) 2.6 -73) ((Player) 2 85) ((Player) 1 152) ((Player) 2.7 54) ((player A 5) 2.2 -33 -0.044 5.7) ((player A 6) 3 -4 0.24 1) ((Player) 0.6 -52) ((player A 11) 1.8 -5 0.036 1.2) ((line t) 34.8 -87))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test337() {
    String s = "(see 83 ((flag r t) 37.3 -13) ((flag p r t) 17.3 -30 -0 -0.2) ((Player) 1.5 157) ((Player) 2.2 152) ((line r) 29.1 -49))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test338() {
    String s = "(see 83 ((goal r) 25 43) ((flag r t) 42.9 -9) ((flag p r t) 22.6 -22 -0 -0.1) ((flag p r c) 8.5 39 -0 0.4) ((player B 1) 4.1 -13 -0.082 0) ((player B 2) 5.5 -14 -0 0.3) ((player B 4) 3.3 -8 0.132 1) ((player B 5) 7.4 19 -0 0.5) ((player B 7) 7.4 35 -0 1) ((Player) 2.5 -80) ((player B 9) 3.7 23 0.074 -2.6) ((Player) 3 78) ((line r) 35.5 -44))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test339() {
    String s = "(see 83 ((flag r t) 42.9 -5) ((flag p r t) 23.6 -22) ((flag p r c) 6.5 29 0 -0) ((player B 1) 5 -40 0 0.5) ((player B 2) 6.7 -34 0 0.8) ((Player) 3 -93) ((player B 4) 4.5 -42 0.09 2.8) ((player B 5) 6 3 0 0.3) ((player B 6) 0.6 8 0.048 1.5) ((player B 7) 6 23 0 0.8) ((player B 9) 3 -20 0.24 -0.1) ((Player) 1.1 82) ((line r) 37.3 -36))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test340() {
    String s = "(see 83 ((flag l t) 43.8 -21) ((flag p l t) 24.5 -4 -0 0) ((player A 1) 4.5 -39 -0.18 -1.9) ((player A 2) 3.7 -13 -0 1.8) ((player A 4) 5 -5 -0.2 0.5) ((player A 5) 6.7 -35 -0.268 0.7) ((player A 6) 7.4 -22 -0 0.6) ((player A 8) 1.6 -8 -0.224 1.2) ((player A 9) 1.1 -21 -0.242 9.6) ((player A 10) 5 -40 -0.2 -1.5) ((player A 11) 6 -28 -0.24 -0.4) ((line t) 38.1 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test341() {
    String s = "(see 83 ((flag r b) 38.5 15) ((flag p r c) 0.9 -23 -0.09 -2.9) ((flag p r b) 20.5 39 -0 0.1) ((Player) 2.2 -172) ((line r) 25.8 42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test342() {
    String s = "(see 83 ((flag r t) 40 15) ((flag p r t) 20.5 -2 -0.41 0) ((Player) 2.5 -47) ((player B 2) 3.7 -25 -0.222 -0.1) ((Player) 2 -59) ((player B 5) 3.7 43 -0.148 3.3) ((Player) 2.5 172) ((line t) 35.2 72))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test343() {
    String s = "(see 83 ((flag c t) 48.4 -40) ((flag r t) 42.9 29) ((flag p r t) 23.8 11 -0 0.1) ((player B 1) 5.5 -14 -0 0.6) ((player B 2) 6.7 -6 0 0.9) ((player B 4) 5 -16 0.1 2.7) ((player B 5) 6 28 -0 0.6) ((player B 6) 1.1 -29 -0.044 2.4) ((player B 9) 3.3 -2 0.198 1.4) ((Player) 1.1 -62) ((line t) 37 88))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test344() {
    String s = "(see 83 ((goal r) 22.9 34) ((flag r t) 38.9 -25) ((flag p r t) 18.7 -42 -0 -0.1) ((player B 2) 1.5 -35 0.03 1.2) ((Player) 0.7 126) ((player B 5) 4.5 32 -0 0.5) ((Player) 2.5 88) ((line r) 25.8 -61))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test345() {
    String s = "(see 83 ((goal r) 18.7 -41) ((flag r b) 40.4 14) ((flag p r c) 2.9 -1 -0.058 0.4) ((flag p r b) 22.4 36 -0 0.1) ((player B 7) 2.2 7 0.044 0.5) ((line r) 27.9 41))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test346() {
    String s = "(see 83 ((goal r) 83.1 29) ((flag c t) 47.9 -18) ((flag r t) 90.9 7) ((flag p r t) 70.1 12) ((flag p r c) 66.7 28) ((ball) 30 26 -0 0.2) ((Player) 2.5 -78) ((Player) 2.7 -121) ((Player) 1.1 90) ((Player) 0.6 -52) ((player) 60.3 26) ((player) 60.3 25) ((player) 60.3 29) ((player) 60.3 26) ((player) 66.7 26) ((player) 60.3 30) ((player) 66.7 28) ((player) 54.6 27) ((player) 60.3 28) ((player) 60.3 31) ((player) 60.3 31) ((line t) 70.8 31))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test347() {
    String s = "(see 83 ((goal r) 22.2 -19) ((flag r b) 38.9 41) ((flag p r c) 5.9 -34 -0 -0) ((player B 7) 5.5 -41 -0 0.9) ((Player) 2.5 -94) ((Player) 0.6 121) ((Player) 1.1 47) ((line r) 22.6 76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test348() {
    String s = "(see 83 ((goal r) 83.1 -9) ((flag c b) 44.3 38) ((flag r t) 90.9 -31) ((flag r b) 89.1 13) ((flag p r t) 70.1 -26) ((flag p r c) 66.7 -9) ((flag p r b) 68.7 7) ((ball) 30 -11 -0 0) ((Player) 2 -125) ((Player) 2.5 -173) ((Player) 1.6 64) ((Player) 0.6 88) ((player) 60.3 -12) ((player) 60.3 -13) ((player) 60.3 -9) ((player) 60.3 -11) ((player) 66.7 -11) ((player) 60.3 -7) ((player) 66.7 -9) ((player B) 54.6 -11) ((player) 60.3 -10) ((player) 60.3 -7) ((player) 60.3 -6) ((line r) 83.9 82))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test349() {
    String s = "(see 83 ((goal r) 26.3 16) ((flag r t) 42.1 -37) ((flag p r c) 9.9 20 -0 0.2) ((player B 1) 3.7 -9 0 0.2) ((player B 2) 5 -20 0.1 0.2) ((Player) 2.5 68) ((player B 4) 3.7 0 0.222 -1.2) ((player B 5) 8.2 5 0 0.3) ((player B 7) 9 18 0 0.6) ((player B 9) 5 21 0 -2.6) ((line r) 27.1 -75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test350() {
    String s = "(see 83 ((goal r) 86.5 11) ((flag c t) 48.4 -33) ((flag r t) 92.8 -9) ((flag r b) 92.8 33) ((Flag) 2 -160) ((flag p r t) 73 -4) ((flag p r c) 70.1 11) ((flag p r b) 73 27) ((ball) 33.1 11 0 -0) ((Player) 0.6 47) ((player A 2) 2.5 14 0.05 -6) ((Player) 1.5 63) ((player A 4) 3 -14 0.06 -0.1) ((Player) 1.8 -106) ((Player) 2.7 -74) ((player A 8) 4.1 39 0 -0.5) ((Player) 1.5 -68) ((player) 66.7 9) ((player) 66.7 8) ((player) 60.3 12) ((player) 66.7 10) ((player) 66.7 10) ((player) 66.7 13) ((player) 66.7 11) ((player) 60.3 10) ((player) 66.7 11) ((player) 66.7 14) ((player) 66.7 14) ((line r) 88.2 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test351() {
    String s = "(see 83 ((goal r) 23.1 40) ((flag r t) 39.6 -19) ((flag p r t) 19.3 -35 -0.386 -0.4) ((Player) 0.7 -45) ((player B 2) 2.2 -33 -0.132 -1.8) ((player B 5) 4.5 31 -0.18 1.9) ((Player) 2 83) ((line r) 28.2 -54))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test352() {
    String s = "(see 83 ((goal r) 86.5 13) ((flag c t) 47 -31) ((flag r t) 92.8 -7) ((flag r b) 92.8 35) ((Flag) 2.5 164) ((flag p r t) 72.2 -2) ((flag p r c) 70.1 14) ((flag p r b) 73 30) ((ball) 33.1 15 -0 0) ((Player) 1.8 95) ((Player) 2.7 47) ((Player) 2.7 87) ((player A 4) 2.5 16 0 0.1) ((Player) 1.1 -164) ((Player) 1.2 -81) ((Player) 1.5 112) ((player) 66.7 11) ((player) 66.7 10) ((player) 60.3 15) ((player) 60.3 12) ((player) 66.7 12) ((player) 66.7 15) ((player) 66.7 13) ((player) 60.3 13) ((player) 66.7 13) ((player) 66.7 16) ((player) 66.7 16) ((line r) 88.2 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test353() {
    String s = "(see 84 ((goal r) 85.6 11) ((flag c t) 48.4 -34) ((flag r t) 92.8 -9) ((flag r b) 91.8 33) ((flag p r t) 72.2 -4) ((flag p r c) 68.7 11) ((flag p r b) 71.5 27) ((ball) 33.1 10) ((Player) 0.9 -112) ((player A 2) 2 -26 0.04 -1.8) ((player A 4) 3 -43 -0 0.1) ((player A 8) 2.5 27 0 0.6) ((player A 9) 2.7 40 -0 1) ((Player) 1.5 -119) ((Player) 2.7 -93) ((player) 60.3 9) ((player) 66.7 7) ((player) 60.3 12) ((player) 60.3 9) ((player) 66.7 9) ((player) 66.7 13) ((player) 66.7 11) ((player) 60.3 10) ((player) 66.7 10) ((player) 60.3 13) ((player) 66.7 14) ((line r) 87.4 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test354() {
    String s = "(see 84 ((goal r) 87.4 11) ((flag c t) 47.5 -33) ((flag r t) 92.8 -10) ((flag r b) 93.7 32) ((Flag) 1.9 145) ((flag p r t) 73 -4) ((flag p r c) 70.8 11) ((flag p r b) 73.7 27) ((ball) 33.1 12) ((Player) 2.2 70) ((player A 2) 3.7 34 -0.074 -0.5) ((player A 4) 3.3 14 -0.066 0.5) ((Player) 1.5 -49) ((Player) 1.8 78) ((player A 11) 0.9 16 -0.054 1.7) ((player) 66.7 9) ((player) 66.7 7) ((player) 60.3 12) ((player) 66.7 9) ((player) 66.7 9) ((player) 66.7 13) ((player) 66.7 11) ((player) 60.3 10) ((player) 66.7 10) ((player) 66.7 13) ((player) 66.7 14) ((line r) 88.2 -79))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test355() {
    String s = "(see 84 ((flag c t) 46.1 42) ((flag l t) 36.6 -35) ((flag p l t) 17.6 -11 -0 -0) ((Player) 1.5 -153) ((Player) 3 178) ((Player) 1.5 170) ((line t) 31.5 85))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test356() {
    String s = "(see 84 ((flag l t) 39.6 -26) ((flag p l t) 20.9 -4 0 0) ((Flag) 2.6 -73) ((Player) 2.2 78) ((Player) 0.9 146) ((Player) 2.7 54) ((player A 5) 2.2 -27 -0 2.2) ((player A 6) 3.3 -3 0.132 0.2) ((Player) 0.6 -51) ((player A 11) 1.8 -4 0.036 0.5) ((line t) 34.8 -87))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test357() {
    String s = "(see 84 ((goal r) 83.9 -10) ((flag c b) 47 37) ((flag r t) 90 -32) ((flag r b) 90.9 11) ((flag p r t) 70.1 -27) ((flag p r c) 67.4 -10) ((flag p r b) 70.8 6) ((ball) 30 -9) ((Player) 2.7 131) ((Player) 1.2 85) ((Player) 3 113) ((Player) 2.5 172) ((player) 60.3 -12) ((player) 60.3 -13) ((player) 60.3 -9) ((player) 60.3 -12) ((player) 66.7 -12) ((player) 60.3 -8) ((player) 66.7 -10) ((player) 60.3 -11) ((player) 60.3 -10) ((player) 60.3 -7) ((player) 60.3 -7) ((line r) 85.6 78))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test358() {
    String s = "(see 84 ((flag c t) 46.5 36) ((flag l t) 40 -38) ((flag p l t) 20.7 -19 -0 -0.1) ((Player) 2.2 -110) ((Player) 2 -136) ((player A 4) 1.2 0 -0.096 0.9) ((Player) 2.2 148) ((Player) 2.7 154) ((Player) 2.7 -100) ((Player) 2.7 -66) ((line t) 34.5 83))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test359() {
    String s = "(see 85 ((flag r b) 38.5 -17) ((Flag) 0.8 -60) ((flag p r b) 20.5 7 -0 0) ((Player) 2.2 155) ((line b) 34.8 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test360() {
    String s = "(see 85 ((goal r) 85.6 13) ((flag c t) 46.5 -31) ((flag r t) 91.8 -7) ((flag r b) 92.8 35) ((flag p r t) 71.5 -2) ((flag p r c) 69.4 14) ((flag p r b) 72.2 30) ((ball) 33.1 15) ((Player) 2 113) ((Player) 2.2 53) ((Player) 2.7 99) ((player A 4) 2.5 22 0 2.1) ((Player) 1.5 -168) ((Player) 1.5 -104) ((Player) 1.8 130) ((player) 60.3 11) ((player) 66.7 10) ((player) 60.3 15) ((player) 60.3 12) ((player) 66.7 12) ((player) 66.7 16) ((player) 66.7 13) ((player) 60.3 13) ((player) 66.7 13) ((player) 60.3 16) ((player) 66.7 16) ((line r) 88.2 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test361() {
    String s = "(see 85 ((flag r t) 39.6 -12) ((flag p r t) 20.1 -30 -0 0) ((Player) 2.2 -80) ((Player) 1.8 -95) ((player B 5) 3.3 20 -0 0.7) ((line r) 30.3 -45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test362() {
    String s = "(see 85 ((goal r) 18.5 -41) ((flag r b) 40.4 14) ((flag p r c) 2.9 -1 -0 0) ((flag p r b) 22.4 36) ((player B 7) 2.2 7 0 0) ((line r) 27.9 41))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test363() {
    String s = "(see 85 ((goal r) 22.9 -1) ((flag p r c) 6.7 10 0 -0) ((Player) 0.7 -86) ((Player) 2.2 -73) ((player B 5) 4.5 -8 0 -0) ((player B 7) 6 10 0 0) ((Player) 3 160) ((player B 9) 1.8 34 -0.036 -1.4) ((line r) 23.1 84))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test364() {
    String s = "(see 85 ((flag c t) 47.9 16) ((flag r t) 90.9 43) ((flag p l t) 24 -36 -0 -0) ((player A 2) 3.3 -43 0 0.2) ((player A 4) 4.5 -29 -0.09 3.3) ((player A 8) 1.2 -11 -0 11.9) ((Player) 0.7 -58) ((line t) 40.4 67))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test365() {
    String s = "(see 85 ((goal r) 24.8 11) ((flag r t) 42.9 -41) ((flag p r c) 8.4 7 -0 0.1) ((player B 4) 3.3 -41 -0 -0.1) ((player B 5) 7.4 -11 -0 0.1) ((player B 6) 3.7 36 0.222 -0.2) ((player B 7) 7.4 5 -0 0.2) ((Player) 2.2 -99) ((player B 9) 3.7 -12 0 -0.5) ((Player) 3 49) ((line r) 25.5 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test366() {
    String s = "(see 85 ((goal r) 22.4 19) ((flag r t) 37.3 -44) ((flag p r c) 6.8 44 -0 0.1) ((Player) 1.6 127) ((Player) 2.2 121) ((player B 5) 4.1 35 -0 0.2) ((line r) 22.2 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test367() {
    String s = "(see 85 ((flag c t) 47.9 -41) ((flag r t) 42.5 29) ((flag p r t) 23.6 11 0 -0) ((player B 1) 5.5 -13 0 0.2) ((player B 2) 6.7 -5 0 0.2) ((player B 4) 5 -16 0 0.1) ((player B 5) 6 30 0 -0) ((player B 6) 0.6 12 0.012 24.3) ((player B 9) 3.7 0 0.074 0.2) ((Player) 1 -72) ((line t) 37 88))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test368() {
    String s = "(see 85 ((goal r) 25.8 16) ((flag r t) 41.7 -37) ((flag p r c) 9.3 21 -0.186 0.6) ((player B 1) 3.3 -10 -0.264 -0.7) ((player B 2) 4.5 -22 -0.18 -1.1) ((Player) 2.2 81) ((player B 4) 3 0 -0.24 0.2) ((player B 5) 7.4 6 -0.296 0.3) ((player B 7) 8.2 20 -0.164 0.7) ((player B 9) 4.1 20 -0.246 0.7) ((line r) 26.6 -75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test369() {
    String s = "(see 85 ((goal r) 83.1 -13) ((flag c b) 43.8 34) ((flag r t) 90.9 -35) ((flag r b) 89.1 9) ((flag p r t) 70.1 -30) ((flag p r c) 66.7 -13) ((flag p r b) 68.7 3) ((ball) 30 -16) ((Player) 2.7 -118) ((Player) 2.7 -162) ((player A 7) 0.7 42 -0.028 -1.4) ((Player) 0.9 -51) ((player) 60.3 -16) ((player) 60.3 -17) ((player) 60.3 -13) ((player) 60.3 -15) ((player) 66.7 -15) ((player) 60.3 -11) ((player) 66.7 -13) ((player) 60.3 -15) ((player) 60.3 -14) ((player) 60.3 -11) ((player) 60.3 -11) ((line r) 84.8 78))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test370() {
    String s = "(see 85 ((goal r) 21.5 -20) ((flag r b) 38.1 42) ((flag p r c) 5.4 -39 -0.216 -1.8) ((Player) 1.1 152) ((Player) 0.6 89) ((line r) 22 76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test371() {
    String s = "(see 85 ((goal r) 82.3 -9) ((flag c b) 43.8 38) ((flag r t) 90 -31) ((flag r b) 88.2 13) ((flag p r t) 69.4 -26) ((flag p r c) 66 -9) ((flag p r b) 68 7) ((ball) 30 -11) ((Player) 2.5 -133) ((Player) 1.2 93) ((Player) 0.9 131) ((player) 60.3 -12) ((player) 60.3 -13) ((player) 60.3 -9) ((player) 60.3 -11) ((player) 66.7 -11) ((player) 60.3 -7) ((player) 66.7 -9) ((player B) 54.6 -11) ((player) 60.3 -10) ((player) 60.3 -7) ((player) 60.3 -7) ((line r) 83.1 82))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test372() {
    String s = "(see 85 ((goal r) 22.9 0) ((flag p r c) 6.8 14 -0 0.1) ((Player) 1.6 -69) ((Player) 0.7 91) ((player B 5) 4.5 -1 -0 0.1) ((player B 7) 6 15 0 0.1) ((Player) 2.2 47) ((line r) 22.9 82))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test373() {
    String s = "(see 85 ((goal r) 86.5 11) ((flag c t) 48.4 -33) ((flag r t) 92.8 -9) ((flag r b) 92.8 33) ((Flag) 2 -160) ((flag p r t) 73 -4) ((flag p r c) 70.1 11) ((flag p r b) 73 27) ((ball) 33.1 11) ((Player) 0.6 51) ((player A 2) 2.5 6 0.05 -0.9) ((Player) 1.5 58) ((player A 4) 3.7 -8 0.222 1.8) ((Player) 1.8 -97) ((player A 8) 4.5 36 0.27 -1.2) ((Player) 1.8 -50) ((player) 66.7 9) ((player) 66.7 8) ((player) 60.3 12) ((player) 66.7 10) ((player) 66.7 10) ((player) 66.7 13) ((player) 66.7 11) ((player) 60.3 10) ((player) 66.7 11) ((player) 66.7 14) ((player) 66.7 14) ((line r) 88.2 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test374() {
    String s = "(see 85 ((goal r) 22.6 6) ((flag p r c) 6.5 -10 0 -0) ((Player) 3 -130) ((player B 5) 6 -36 0 0) ((player B 6) 1.1 -1 0.22 6.6) ((player B 7) 6 -15 0 0.1) ((player B 11) 1 31 0 1.2) ((line r) 23.1 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test375() {
    String s = "(see 86 ((flag c t) 48.4 4) ((flag r t) 92.8 28) ((Flag) 2.6 -114) ((flag p r t) 72.2 34) ((player A 2) 2.2 33 0 -0.4) ((Player) 1.2 78) ((player A 4) 3.7 22 0.074 0.8) ((Player) 2.2 -65) ((player A 6) 3.7 -44 0 0.1) ((Player) 0.6 -91) ((player A 11) 2.2 -21 0.044 2.4) ((line t) 44.7 50))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test376() {
    String s = "(see 86 ((flag c t) 46.1 2) ((flag r t) 91.8 25) ((flag p r t) 72.2 31) ((Player) 1.6 160) ((Player) 1.6 98) ((player) 66.7 44) ((line t) 43.8 45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test377() {
    String s = "(see 86 ((goal r) 87.4 -19) ((flag c b) 49.4 25) ((flag r t) 92.8 -40) ((flag r b) 93.7 2) ((Flag) 2 116) ((flag p r t) 73 -34) ((flag p r c) 70.8 -18) ((flag p r b) 73.7 -3) ((ball) 33.1 -17) ((player A 1) 2.2 43 0 0.4) ((player A 2) 3.3 3 -0 -0.1) ((player A 3) 3.3 30 0.066 -3.2) ((player A 4) 4.1 -14 0.082 0.1) ((Player) 1.6 -84) ((player A 7) 6.7 26 -0 0.1) ((player A 8) 6 15 0.12 -0.4) ((player A 9) 5.5 25 -0 0.2) ((Player) 1.8 52) ((player A 11) 1.6 -23 0.096 -0.5) ((player) 66.7 -21) ((player) 66.7 -22) ((player) 60.3 -18) ((player) 66.7 -20) ((player) 66.7 -20) ((player) 66.7 -16) ((player) 66.7 -18) ((player) 60.3 -19) ((player) 66.7 -19) ((player) 66.7 -16) ((player) 66.7 -16) ((line r) 92.8 69))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test378() {
    String s = "(see 86 ((goal r) 83.1 -10) ((flag c b) 46.5 37) ((flag r t) 89.1 -32) ((flag r b) 90 11) ((flag p r t) 69.4 -27) ((flag p r c) 66.7 -10) ((flag p r b) 69.4 6) ((ball) 30 -9 -0 -0) ((Player) 1.3 124) ((Player) 3 120) ((Player) 2.5 -179) ((player) 60.3 -12) ((player) 60.3 -14) ((player) 60.3 -9) ((player) 60.3 -12) ((player) 66.7 -11) ((player) 60.3 -8) ((player) 66.7 -10) ((player) 60.3 -11) ((player) 60.3 -11) ((player) 60.3 -7) ((player) 60.3 -7) ((line r) 84.8 78))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test379() {
    String s = "(see 86 ((flag c t) 46.1 4) ((flag r t) 90.9 29) ((flag p r t) 70.1 34) ((Player) 2.2 -146) ((Player) 1.6 -179) ((player A 4) 1.3 6 0.052 3.4) ((Player) 2.7 102) ((Player) 2.7 124) ((Player) 2.7 -134) ((Player) 2 -82) ((line t) 43.4 51))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test380() {
    String s = "(see 86 ((goal r) 84.8 11) ((flag c t) 47.9 -34) ((flag r t) 91.8 -9) ((flag r b) 90.9 33) ((flag p r t) 71.5 -4) ((flag p r c) 68.7 11) ((flag p r b) 70.8 28) ((ball) 33.1 10 -0 0.1) ((Player) 1.2 -140) ((player A 2) 1.6 -38 -0.16 -4.9) ((player A 4) 3 -35 -0.12 -0.8) ((player A 8) 3 30 -0.12 1.9) ((Player) 2.5 51) ((Player) 1.8 -136) ((Player) 2.7 -86) ((player) 60.3 9) ((player) 66.7 7) ((player) 60.3 12) ((player) 60.3 9) ((player) 66.7 10) ((player) 66.7 13) ((player) 66.7 11) ((player) 60.3 10) ((player) 60.3 10) ((player) 60.3 13) ((player) 60.3 14) ((line r) 87.4 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test381() {
    String s = "(see 86 ((goal r) 25.5 16) ((flag r t) 41.3 -38) ((flag p r c) 9 22 -0.18 0.2) ((player B 1) 3.7 -5 0.148 1.6) ((player B 2) 5 -19 0.1 0.9) ((Player) 2.2 71) ((player B 4) 2.7 0 -0.108 0.1) ((player B 5) 7.4 10 0 1.6) ((player B 7) 8.2 25 0 1.9) ((player B 9) 4.1 20 -0.082 0.3) ((line r) 26.3 -75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test382() {
    String s = "(see 86 ((goal r) 18.2 -43) ((flag r b) 40 14) ((flag p r c) 2.3 0 -0.23 0) ((flag p r b) 22 37 -0 0.4) ((player B 7) 2.2 16 0.044 3.3) ((line r) 27.1 41))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test383() {
    String s = "(see 86 ((goal r) 86.5 11) ((flag c t) 48.4 -33) ((flag r t) 92.8 -9) ((flag r b) 92.8 33) ((Flag) 2 -160) ((flag p r t) 73 -4) ((flag p r c) 70.1 11) ((flag p r b) 73 27) ((ball) 33.1 11) ((Player) 0.6 50) ((player A 2) 2.7 5 0 -0.3) ((player A 3) 1.8 42 0.144 -5.2) ((player A 4) 3.7 -7 0.074 0.6) ((Player) 1.8 -95) ((player A 8) 4.5 35 0.09 -0.5) ((player A 11) 2 -44 0.08 2.2) ((player) 66.7 9) ((player) 66.7 8) ((player) 60.3 12) ((player) 66.7 10) ((player) 66.7 10) ((player) 66.7 13) ((player) 66.7 12) ((player) 60.3 10) ((player) 66.7 11) ((player) 66.7 14) ((player) 66.7 14) ((line r) 88.2 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test384() {
    String s = "(see 86 ((goal r) 85.6 14) ((flag c t) 46.1 -31) ((flag r t) 90.9 -7) ((flag r b) 92.8 35) ((flag p r t) 71.5 -2) ((flag p r c) 68.7 14) ((flag p r b) 72.2 30) ((ball) 33.1 15) ((Player) 2.2 120) ((Player) 2 58) ((Player) 2.7 93) ((player A 4) 2.5 24 -0 0.8) ((Player) 1.6 -170) ((Player) 1.6 -113) ((Player) 2 136) ((player) 60.3 12) ((player) 66.7 10) ((player) 60.3 14) ((player) 60.3 12) ((player) 66.7 12) ((player) 66.7 16) ((player) 66.7 14) ((player) 60.3 13) ((player) 66.7 13) ((player) 66.7 16) ((player) 66.7 16) ((line r) 87.4 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test385() {
    String s = "(see 86 ((flag c t) 47.9 16) ((flag r t) 90.9 43) ((flag p l t) 24 -36 -0 0) ((player A 2) 3.3 -43 -0 0.1) ((player A 4) 4.1 -26 -0 1.4) ((player A 8) 1.2 0 0.024 4.6) ((Player) 0.7 -59) ((line t) 40.4 67))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test386() {
    String s = "(see 86 ((goal r) 22.2 0) ((flag p r c) 6.2 16 -0.248 0.7) ((Player) 1.8 -70) ((Player) 0.9 133) ((player B 5) 4.1 3 -0.082 2.3) ((player B 7) 6 22 -0 2.9) ((Player) 1.8 61) ((line r) 22.4 82))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test387() {
    String s = "(see 86 ((goal r) 21.8 19) ((Player) 1.8 125) ((Player) 2.7 134) ((player B 5) 4.1 44 0.082 3.3) ((line r) 21.5 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test388() {
    String s = "(see 86 ((goal r) 22.9 -1) ((flag p r c) 6.7 10 0 -0) ((player B 1) 0.9 -44 0.18 10.8) ((Player) 2.7 -60) ((Player) 3 112) ((player B 5) 5 -3 0.2 2) ((player B 7) 6 15 0.12 2) ((Player) 2.7 160) ((player B 9) 1.8 32 -0 -0.6) ((line r) 23.1 84))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test389() {
    String s = "(see 86 ((goal r) 82.3 -9) ((flag c b) 43.4 39) ((flag r t) 90 -31) ((flag r b) 88.2 13) ((flag p r t) 69.4 -26) ((flag p r c) 66 -9) ((flag p r b) 68 7) ((ball) 30 -11) ((Player) 2.7 -136) ((Player) 3 -169) ((Player) 1.2 105) ((Player) 1.1 140) ((player) 60.3 -12) ((player) 60.3 -13) ((player) 60.3 -9) ((player) 60.3 -11) ((player) 66.7 -11) ((player) 60.3 -7) ((player) 66.7 -9) ((player) 54.6 -11) ((player) 60.3 -10) ((player) 60.3 -7) ((player) 60.3 -7) ((line r) 83.1 82))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test390() {
    String s = "(see 86 ((goal r) 83.1 -13) ((flag c b) 43.8 34) ((flag r t) 90.9 -35) ((flag r b) 89.1 9) ((flag p r t) 70.1 -30) ((flag p r c) 66.7 -13) ((flag p r b) 68.7 3) ((ball) 30 -16 0 -0) ((Player) 2.7 -118) ((Player) 2.5 -152) ((player A 7) 0.7 41 -0.014 -0.5) ((player A 8) 1.1 -43 0.088 2.8) ((player) 60.3 -16) ((player) 60.3 -17) ((player) 60.3 -13) ((player) 60.3 -15) ((player) 66.7 -15) ((player) 60.3 -11) ((player) 66.7 -13) ((player) 60.3 -15) ((player) 60.3 -14) ((player) 60.3 -11) ((player) 60.3 -11) ((line r) 84.8 78))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test391() {
    String s = "(see 86 ((flag r b) 37.7 -17) ((Flag) 0.7 -114) ((flag p r b) 19.9 7 -0.398 0.1) ((Player) 2.2 163) ((line b) 34.1 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test392() {
    String s = "(see 86 ((goal r) 21.3 -20) ((flag r b) 38.1 42) ((flag p r c) 5.2 -41 -0.104 -0.9) ((player B 7) 4.5 -40 -0.18 2.2) ((Player) 0.8 158) ((Player) 0.7 114) ((line r) 21.8 76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test393() {
    String s = "(see 86 ((flag c t) 47.9 -41) ((flag r t) 42.5 29) ((flag p r t) 23.6 11 0 -0) ((player B 1) 5.5 -7 -0 2.6) ((player B 2) 6.7 0 0 2.1) ((player B 4) 5 -16 0 0) ((player B 5) 6 36 -0 2.3) ((player B 6) 0.7 37 0.042 8.8) ((player B 8) 5.5 -44 -0 0.9) ((player B 9) 3.7 0 0 0.1) ((Player) 0.6 -49) ((line t) 37 88))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test394() {
    String s = "(see 86 ((goal r) 24.3 11) ((flag r t) 42.1 -41) ((flag p r c) 7.8 8 -0.312 0.4) ((player B 1) 3.7 -42 -0.074 1) ((Player) 3 -48) ((player B 5) 6.7 -7 -0.134 1.9) ((player B 6) 3.7 42 -0.074 2.6) ((player B 7) 7.4 11 -0.148 2.6) ((Player) 2.2 -109) ((player B 9) 3 -14 -0.24 -1) ((Player) 3 52) ((line r) 25 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test395() {
    String s = "(see 86 ((flag r t) 39.6 -12) ((flag p r t) 20.1 -30 -0 -0) ((Player) 1.8 -66) ((player B 2) 3.3 -42 0.066 4.5) ((Player) 1.8 -96) ((player B 5) 3.7 30 0.074 3.6) ((line r) 30.3 -45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test396() {
    String s = "(see 86 ((goal r) 22.2 6) ((flag p r c) 6 -11 0 0.1) ((Player) 3 -127) ((player B 5) 5.5 -34 0 2.6) ((player B 6) 0.8 5 0.112 3.4) ((player B 7) 5.5 -10 -0 2.8) ((Player) 0.6 54) ((line r) 22.4 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test397() {
    String s = "(see 87 ((flag c t) 45.6 4) ((flag r t) 90 29) ((flag p r t) 70.1 35) ((Player) 2.2 -148) ((Player) 2 177) ((player A 4) 0.7 17 -0.21 7.8) ((Player) 2 -100) ((line t) 42.5 51))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test398() {
    String s = "(see 87 ((flag c t) 47.5 4) ((flag r t) 91.8 29) ((Flag) 2.9 -124) ((flag p r t) 72.2 34) ((player A 2) 2.2 30 0.044 -1) ((Player) 1.3 95) ((player A 4) 3 27 -0.18 2) ((Player) 1.6 -69) ((Player) 0.9 -131) ((player A 11) 1.8 -26 -0.18 -2.4) ((line t) 44.3 50))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test399() {
    String s = "(see 87 ((flag c t) 46.1 2) ((flag r t) 91.8 25) ((flag p r t) 72.2 31) ((Player) 1.6 138) ((Player) 1.6 95) ((player) 66.7 44) ((line t) 43.8 45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test400() {
    String s = "(see 87 ((goal r) 84.8 11) ((flag c t) 47.5 -34) ((flag r t) 91.8 -9) ((flag r b) 90.9 33) ((flag p r t) 71.5 -4) ((flag p r c) 68 11) ((flag p r b) 70.8 28) ((ball) 33.1 10) ((Player) 1.3 -123) ((player A 2) 2 -41 0.2 -1.1) ((player A 4) 2.7 -36 -0.054 -0.4) ((Player) 3 -114) ((Player) 2.7 47) ((player A 8) 2.7 33 -0.054 0.9) ((Player) 2.2 56) ((Player) 2 -141) ((Player) 2.7 -89) ((player) 60.3 9) ((player) 66.7 7) ((player) 60.3 12) ((player) 60.3 9) ((player) 66.7 10) ((player) 66.7 13) ((player) 66.7 12) ((player) 60.3 10) ((player) 66.7 10) ((player) 60.3 13) ((player) 60.3 14) ((line r) 86.5 -77))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test401() {
    String s = "(see 87 ((goal r) 83.1 -41) ((flag c b) 46.5 6) ((flag r b) 90 -19) ((flag p r c) 66 -41) ((flag p r b) 69.4 -24) ((ball) 30 -40 -0 -0) ((Player) 0.7 103) ((Player) 2.7 88) ((player A 7) 3.7 42 -0.222 -0.9) ((player A 8) 3.3 34 -0 -0) ((Player) 2.5 149) ((player) 60.3 -43) ((player) 60.3 -40) ((player) 60.3 -43) ((player) 66.7 -42) ((player) 60.3 -39) ((player) 66.7 -40) ((player) 60.3 -42) ((player) 60.3 -42) ((player) 60.3 -39) ((player) 60.3 -38) ((line b) 51.9 -42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test402() {
    String s = "(see 87 ((goal r) 86.5 -19) ((flag c b) 48.9 25) ((flag r t) 92.8 -40) ((flag r b) 93.7 2) ((Flag) 2.4 130) ((flag p r t) 72.2 -35) ((flag p r c) 70.1 -19) ((flag p r b) 73 -3) ((ball) 33.1 -18) ((player A 1) 1.6 40 -0.256 -1.9) ((player A 2) 3 -8 -0.12 -5.5) ((player A 3) 3 32 -0.18 1) ((player A 4) 3.7 -17 -0.222 -1.3) ((Player) 1.6 -107) ((player A 7) 5.5 24 -0.33 -1.1) ((player A 8) 5.5 16 -0.22 0.5) ((player A 9) 5 28 -0.2 1.5) ((Player) 1.5 73) ((player A 11) 1.2 -36 -0.144 -7.3) ((player) 66.7 -21) ((player) 66.7 -22) ((player) 60.3 -18) ((player) 66.7 -20) ((player) 66.7 -20) ((player) 66.7 -16) ((player) 66.7 -18) ((player) 60.3 -20) ((player) 66.7 -20) ((player) 66.7 -16) ((player) 66.7 -16) ((line r) 91.8 69))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test403() {
    String s = "(see 88 ((goal r) 22.2 -1) ((flag p r c) 5.9 12 -0.118 0.1) ((Player) 0.7 -66) ((Player) 2.5 -68) ((Player) 3 120) ((player B 5) 4.5 0 -0.09 0.3) ((player B 7) 6 21 -0 0.6) ((player B 9) 1.3 13 -0.026 -3.2) ((line r) 22.2 84))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test404() {
    String s = "(see 88 ((goal r) 82.3 -40) ((flag c b) 43.4 8) ((flag r b) 88.2 -17) ((flag p r c) 65.4 -40) ((flag p r b) 68 -23) ((ball) 30 -43) ((Player) 2.7 162) ((Player) 0.6 89) ((Player) 1.2 112) ((player) 60.3 -43) ((player) 60.3 -44) ((player) 60.3 -40) ((player) 60.3 -42) ((player) 66.7 -42) ((player) 60.3 -38) ((player) 66.7 -40) ((player) 54.6 -42) ((player) 60.3 -42) ((player) 60.3 -38) ((player) 60.3 -38) ((line b) 50.4 -39))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test405() {
    String s = "(see 88 ((goal r) 21.8 36) ((flag r t) 42.9 -15) ((flag p r t) 23.6 -33 0 -0) ((flag p r c) 5.8 14 0 -0) ((player B 2) 6.7 -41 0 0.4) ((player B 5) 5.5 -5 -0 0.4) ((player B 6) 0.7 2 0.014 1.1) ((player B 7) 5 18 -0 0.5) ((player B 9) 4.5 -36 0.09 0.8) ((Player) 0.6 -94) ((line r) 30 -45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test406() {
    String s = "(see 88 ((goal r) 83.1 -13) ((flag c b) 43.8 34) ((flag r t) 90.9 -35) ((flag r b) 89.1 9) ((flag p r t) 70.1 -30) ((flag p r c) 66.7 -13) ((flag p r b) 68.7 3) ((ball) 30 -16 0 0) ((Player) 2.2 -145) ((player A 7) 0.7 -17 0 1) ((player A 8) 1.2 -39 0.024 0.6) ((player) 60.3 -16) ((player) 60.3 -17) ((player) 60.3 -13) ((player) 60.3 -15) ((player) 66.7 -14) ((player) 60.3 -11) ((player) 66.7 -13) ((player) 60.3 -15) ((player) 60.3 -15) ((player) 60.3 -11) ((player) 60.3 -11) ((line r) 84.8 78))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test407() {
    String s = "(see 88 ((flag c b) 48.4 28) ((Flag) 0.9 -165) ((flag p r b) 19.3 -20 -0 0) ((Player) 2.5 140) ((line b) 35.2 71))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test408() {
    String s = "(see 88 ((goal r) 21.3 -10) ((flag r b) 43.4 39) ((flag p r c) 6 20 -0 0.3) ((Player) 1.8 95) ((Player) 2.5 96) ((player B 5) 4.1 18 0 0.5) ((player B 7) 6 28 0 0.5) ((Player) 2.7 65) ((line r) 22.6 68))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test409() {
    String s = "(see 88 ((goal r) 22.2 -35) ((flag r b) 38.5 25) ((flag p r b) 18.5 43 0 -0) ((Player) 2.7 -162) ((player B 6) 1 -33 0.02 0.4) ((player B 11) 0.6 11 0 -0.1) ((line r) 25.3 60))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test410() {
    String s = "(see 88 ((flag r t) 38.9 -12) ((flag p r t) 19.3 -32 -0 -0.2) ((Player) 1.3 -87) ((Player) 2.7 -48) ((Player) 1.3 -116) ((player B 5) 3 43 -0.06 1.9) ((line r) 29.4 -45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test411() {
    String s = "(see 88 ((goal r) 23.8 -17) ((flag r b) 41.3 38) ((flag p r c) 7.4 -20 -0 0) ((Player) 3 -69) ((player B 5) 6.7 -34 -0 0.3) ((player B 6) 3.3 17 -0 0.4) ((player B 7) 6.7 -13 -0 0.5) ((Player) 2.5 -143) ((player B 10) 2.7 30 -0.054 0.8) ((player B 11) 3.3 29 -0 0.7) ((line r) 24.8 74))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test412() {
    String s = "(see 88 ((flag c t) 47.5 16) ((flag r t) 90 43) ((flag p l t) 23.6 -37 0 0) ((player A 2) 3.3 -37 0 -0.1) ((Player) 2.7 -78) ((player A 4) 3.7 -28 0 0.3) ((player A 8) 0.6 15 0.024 0.8) ((Player) 0.7 -119) ((line t) 39.6 67))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test413() {
    String s = "(see 88 ((flag r b) 38.1 12) ((flag p r b) 18.4 31 -0 0) ((Player) 1 132) ((Player) 0.7 94) ((line r) 29.1 46))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test414() {
    String s = "(see 88 ((goal r) 86.5 -28) ((flag c b) 47.9 16) ((flag r b) 92.8 -6) ((Flag) 2 159) ((flag p r t) 73 -44) ((flag p r c) 70.1 -28) ((flag p r b) 73 -12) ((ball) 33.1 -28 0 -0) ((player A 1) 1.1 -39 0.088 -3.2) ((player A 2) 3.3 -44 -0 0.1) ((player A 3) 2 -4 0.04 -0.7) ((Player) 1.3 -103) ((player A 7) 4.5 1 0 0.1) ((player A 8) 5 -5 0 -0.1) ((player A 9) 4.1 7 -0 0) ((Player) 2.2 -81) ((player) 66.7 -30) ((player) 66.7 -31) ((player) 60.3 -27) ((player) 66.7 -29) ((player) 66.7 -29) ((player) 66.7 -26) ((player) 66.7 -27) ((player) 60.3 -29) ((player) 66.7 -29) ((player) 66.7 -25) ((player) 66.7 -25) ((line b) 72.2 -27))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test415() {
    String s = "(see 88 ((flag r b) 39.6 -16) ((flag p r c) 2 -32 -0.04 -0) ((flag p r b) 21.8 6 -0 0.1) ((player B 7) 2.5 -10 0 0.5) ((line b) 35.9 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test416() {
    String s = "(see 88 ((goal r) 85.6 -13) ((flag c b) 48.4 33) ((flag r t) 90.9 -35) ((flag r b) 92.8 8) ((flag p r t) 71.5 -29) ((flag p r c) 68.7 -12) ((flag p r b) 72.2 3) ((ball) 33.1 -11) ((Player) 1.6 85) ((player A 2) 2 9 -0 0.6) ((Player) 2.7 63) ((player A 4) 2.5 -1 -0 0.1) ((Player) 1.1 140) ((Player) 1.8 -125) ((player A 7) 5 42 -0 0.3) ((player A 8) 5 35 0 0.1) ((Player) 2.2 112) ((player) 60.3 -15) ((player) 66.7 -16) ((player) 60.3 -12) ((player) 60.3 -14) ((player) 66.7 -14) ((player) 66.7 -10) ((player) 66.7 -12) ((player) 60.3 -14) ((player) 66.7 -14) ((player) 60.3 -10) ((player) 66.7 -10) ((line r) 88.2 75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test417() {
    String s = "(see 88 ((goal r) 25.3 -11) ((flag r b) 43.4 39) ((flag p r c) 8.9 -6 -0 0) ((player B 1) 3.7 -32 0 0.3) ((player B 3) 2.5 37 0 -0.6) ((player B 4) 3.3 -24 0.066 0.5) ((player B 5) 7.4 -15 0 0.3) ((player B 6) 5.5 26 0 0.1) ((player B 7) 9 0 0 0.3) ((player B 9) 4.5 -15 0.09 -0.8) ((player B 10) 5 34 -0 0.2) ((player B 11) 5.5 33 -0 0.2) ((line r) 26.3 75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test418() {
    String s = "(see 88 ((goal r) 22 -29) ((flag r b) 42.5 23) ((flag p r c) 5.9 -10 -0 0.1) ((flag p r b) 23.3 41 -0 0.1) ((Player) 1.8 -98) ((Player) 0.7 84) ((player B 5) 4.1 -21 -0 0.4) ((player B 7) 6 -1 -0 0.5) ((player B 9) 1.3 12 -0.026 -3) ((line r) 26.8 54))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test419() {
    String s = "(see 89 ((goal r) 85.6 18) ((flag c t) 47.5 -27) ((flag r t) 91.8 -3) ((flag r b) 91.8 39) ((flag p r t) 71.5 1) ((flag p r c) 68.7 18) ((flag p r b) 71.5 34) ((ball) 33.1 18) ((player A 2) 2.2 0 -0.044 0.6) ((Player) 1.3 71) ((player A 4) 3 8 0.12 4.3) ((Player) 1.2 -104) ((Player) 0.8 156) ((player A 11) 1.5 -40 0.03 9) ((player) 66.7 15) ((player) 66.7 14) ((player) 60.3 18) ((player) 60.3 16) ((player) 66.7 16) ((player) 66.7 20) ((player) 66.7 18) ((player) 60.3 16) ((player) 66.7 16) ((player) 60.3 20) ((player) 66.7 20) ((line r) 90 -71))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test420() {
    String s = "(see 89 ((goal r) 84.8 -21) ((flag c b) 46.1 25) ((flag r t) 91.8 -43) ((flag r b) 90.9 0) ((flag p r t) 71.5 -38) ((flag p r c) 68 -21) ((flag p r b) 70.8 -5) ((ball) 33.1 -22) ((Player) 1.3 -147) ((Player) 2.2 -76) ((Player) 2.7 -56) ((Player) 2.7 -145) ((player A 7) 2.7 14 -0 0.3) ((player A 8) 3.3 4 0.198 1.1) ((player A 9) 2.2 26 -0 0.4) ((Player) 1.5 -177) ((Player) 2.5 -111) ((player) 60.3 -23) ((player) 66.7 -25) ((player) 60.3 -21) ((player) 60.3 -23) ((player) 66.7 -22) ((player) 66.7 -19) ((player) 66.7 -20) ((player) 60.3 -22) ((player) 66.7 -22) ((player) 60.3 -19) ((player) 66.7 -19) ((line r) 90 69))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test421() {
    String s = "(see 89 ((goal r) 82.3 -41) ((flag c b) 45.6 6) ((flag r b) 89.1 -19) ((flag p r c) 66 -41) ((flag p r b) 68.7 -24) ((ball) 30 -41) ((Player) 1 146) ((Player) 2.7 101) ((player A 8) 3 33 -0 -0.3) ((Player) 2.5 157) ((player) 60.3 -44) ((player) 60.3 -41) ((player) 60.3 -43) ((player) 66.7 -43) ((player) 60.3 -39) ((player) 66.7 -41) ((player) 60.3 -43) ((player) 60.3 -43) ((player) 60.3 -39) ((player) 60.3 -39) ((line b) 51.4 -42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test422() {
    String s = "(see 89 ((flag c t) 45.2 2) ((flag r t) 90.9 25) ((flag p r t) 71.5 31) ((Player) 2.5 144) ((Player) 2.5 107) ((player) 66.7 44) ((line t) 42.9 45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test423() {
    String s = "(see 89 ((flag c b) 48.4 -3) ((flag r b) 92.8 -27) ((Flag) 2.6 107) ((flag p r b) 73 -32) ((player A 1) 1.2 7 -0.048 -0.6) ((player A 2) 2.7 -42 -0.054 -0.2) ((player A 3) 2.7 5 -0.054 0.2) ((player A 4) 3.7 -41 0.148 2.2) ((Player) 2.5 -130) ((player A 7) 5 -4 -0 0.2) ((player A 8) 5.5 -11 0.22 0.1) ((player A 9) 5 1 -0 0.3) ((player A 10) 1.5 37 0.09 -6.1) ((Player) 1.5 -61) ((line b) 46.1 -49))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test424() {
    String s = "(see 89 ((goal r) 83.1 6) ((flag c t) 45.6 -41) ((flag r t) 90 -16) ((flag r b) 90 28) ((flag p r t) 69.4 -10) ((flag p r c) 66.7 6) ((flag p r b) 70.1 23) ((ball) 30 7 0 -0) ((Player) 2.2 167) ((Player) 2.2 130) ((player A 4) 1 14 0.22 8.1) ((Player) 2.7 -167) ((Player) 3 161) ((Player) 1.3 -147) ((player) 60.3 4) ((player) 60.3 2) ((player) 60.3 6) ((player) 60.3 4) ((player) 66.7 5) ((player) 60.3 8) ((player) 66.7 7) ((player) 60.3 5) ((player) 60.3 5) ((player) 60.3 8) ((player) 60.3 8) ((line r) 83.9 -84))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test425() {
    String s = "(see 89 ((flag r b) 37.3 12) ((flag p r b) 17.6 33 -0.352 0.4) ((Player) 1.5 151) ((Player) 0.7 170) ((line r) 28.5 46))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test426() {
    String s = "(see 89 ((goal r) 84.8 -13) ((flag c b) 47.9 33) ((flag r t) 90.9 -35) ((flag r b) 91.8 8) ((flag p r t) 70.8 -29) ((flag p r c) 68 -13) ((flag p r b) 71.5 3) ((ball) 33.1 -11) ((Player) 1.5 107) ((player A 2) 1.3 12 -0.234 1.9) ((Player) 2.5 75) ((player A 4) 2.5 5 -0 2.8) ((Player) 1.5 154) ((Player) 2.5 -132) ((player A 8) 5 37 0 1) ((Player) 2.2 113) ((player) 60.3 -15) ((player) 66.7 -16) ((player) 60.3 -12) ((player) 60.3 -14) ((player) 66.7 -14) ((player) 66.7 -10) ((player) 66.7 -12) ((player) 60.3 -14) ((player) 66.7 -14) ((player) 60.3 -10) ((player) 66.7 -10) ((line r) 87.4 75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test427() {
    String s = "(see 89 ((goal r) 24.8 -11) ((flag r b) 42.9 40) ((flag p r c) 8.3 -6 -0.166 -0) ((player B 1) 3.3 -36 -0.198 -2) ((Player) 2 47) ((player B 4) 2.7 -27 -0.162 -1.6) ((player B 5) 6.7 -16 -0.268 -0.3) ((player B 6) 6 29 0.12 1.4) ((player B 7) 8.2 0 -0.164 0.3) ((player B 9) 4.1 -18 -0.164 -1.1) ((player B 10) 4.5 39 -0.18 2) ((player B 11) 5 31 -0.2 -1) ((line r) 25.5 75))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test428() {
    String s = "(see 89 ((goal r) 22.2 -35) ((flag r b) 38.5 25) ((flag p r b) 18.5 43 0 -0) ((Player) 2.7 -162) ((player B 6) 1.5 -14 0.21 5) ((player B 11) 0.9 -29 0.162 -10.8) ((line r) 25.3 60))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test429() {
    String s = "(see 89 ((goal r) 82.3 26) ((flag c t) 47.5 -22) ((flag r t) 90 4) ((flag p r t) 70.1 8) ((flag p r c) 66 25) ((flag p r b) 68 42) ((ball) 30 23 0 -0) ((Player) 2.7 -116) ((player A 8) 0.9 19 0.18 11) ((Player) 0.7 -157) ((player) 60.3 23) ((player) 60.3 21) ((player) 60.3 25) ((player) 60.3 23) ((player) 66.7 24) ((player) 60.3 28) ((player) 66.7 26) ((player) 60.3 24) ((player) 60.3 24) ((player) 60.3 27) ((player) 60.3 27) ((line t) 78.3 28))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test430() {
    String s = "(see 89 ((flag c b) 48.4 28) ((Flag) 1 -167) ((flag p r b) 19.3 -19 -0 0) ((Player) 2.5 141) ((player B 6) 4.1 41 -0.082 -3.3) ((line b) 35.2 71))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test431() {
    String s = "(see 89 ((goal r) 21.3 37) ((flag r t) 42.1 -15) ((flag p r t) 23.1 -34 -0 -0.3) ((flag p r c) 5.3 15 -0.212 0.8) ((player B 2) 6.7 -44 -0.134 -1.2) ((player B 5) 5 -5 -0.2 -0) ((Player) 0.7 78) ((player B 7) 4.5 22 -0.18 1.5) ((player B 9) 4.1 -40 -0.164 -1.7) ((Player) 0.9 -136) ((line r) 29.4 -45))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test432() {
    String s = "(see 89 ((goal r) 81.5 -40) ((flag c b) 42.9 8) ((flag r b) 87.4 -17) ((flag p r c) 65.4 -41) ((flag p r b) 67.4 -23) ((ball) 30 -44) ((Player) 0.9 132) ((Player) 1.5 133) ((player) 60.3 -43) ((player) 60.3 -41) ((player) 60.3 -43) ((player) 66.7 -42) ((player) 60.3 -38) ((player) 66.7 -40) ((player) 54.6 -42) ((player) 60.3 -42) ((player) 60.3 -39) ((player) 60.3 -39) ((line b) 49.9 -39))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test433() {
    String s = "(see 89 ((goal r) 20.9 17) ((flag r t) 38.5 -43) ((flag p r c) 4.5 32 -0 0.4) ((Player) 1.3 -121) ((Player) 2.7 -80) ((Player) 1.3 -150) ((player B 5) 3 14 -0 0.7) ((player B 7) 4.5 44 0 0.7) ((line r) 21.3 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test434() {
    String s = "(see 89 ((flag r b) 39.6 -16) ((flag p r c) 2 -32 -0 0) ((flag p r b) 21.5 6 -0 0) ((player B 6) 5 42 0.1 -2.7) ((player B 7) 2.5 -10 0 0.2) ((Player) 3 100) ((line b) 35.9 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test435() {
    String s = "(see 89 ((goal r) 85.6 -28) ((flag c b) 47.5 17) ((flag r b) 91.8 -6) ((Flag) 2.6 163) ((flag p r t) 72.2 -44) ((flag p r c) 69.4 -28) ((flag p r b) 72.2 -12) ((ball) 33.1 -28 -0 -0.2) ((Player) 0.8 -69) ((Player) 3 -52) ((player A 3) 1.5 -5 -0.21 -0.6) ((player A 4) 3.7 -43 -0.074 1.1) ((Player) 1.5 -120) ((player A 7) 4.1 2 -0.246 0.4) ((player A 8) 5 -3 0 0.6) ((player A 9) 3.7 9 -0.222 0.8) ((Player) 2.2 -80) ((player) 66.7 -30) ((player) 66.7 -31) ((player) 60.3 -27) ((player) 66.7 -30) ((player) 66.7 -29) ((player) 66.7 -25) ((player) 66.7 -27) ((player) 60.3 -29) ((player) 66.7 -29) ((player) 66.7 -26) ((player) 66.7 -26) ((line b) 71.5 -27))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test436() {
    String s = "(see 89 ((goal r) 22 -29) ((flag r b) 42.5 23) ((flag p r c) 5.8 -10 -0 0) ((flag p r b) 23.1 41 -0 0) ((Player) 1.8 -98) ((Player) 0.7 81) ((player B 5) 4.1 -21 -0 0.1) ((player B 6) 5.5 41 0.22 -1.3) ((player B 7) 6 -1 -0 0.2) ((player B 9) 1.3 9 -0 -1.3) ((line r) 26.8 54))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test437() {
    String s = "(see 89 ((goal r) 22.2 -32) ((flag r b) 42.1 20) ((flag p r c) 5.9 -19 -0 0) ((flag p r b) 22.6 38 -0 0.1) ((Player) 0.7 -100) ((Player) 2.5 -100) ((Player) 3 89) ((player B 5) 4.5 -32 -0 0.1) ((player B 6) 5 34 0.2 -1) ((player B 7) 5.5 -10 -0 0.2) ((Player) 2.7 129) ((player B 9) 1.3 -21 -0 -1.4) ((player B 11) 4.5 40 -0.18 -2.1) ((line r) 27.9 52))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test438() {
    String s = "(see 89 ((flag c b) 43.8 -6) ((flag r b) 89.1 -31) ((flag p r b) 68.7 -37) ((Player) 2.2 174) ((Player) 0.7 -57) ((Player) 1.5 -59) ((line b) 39.6 -52))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test439() {
    String s = "(see 89 ((goal r) 21.3 -10) ((flag r b) 43.4 39) ((flag p r c) 6 20 -0 0.1) ((Player) 1.8 95) ((Player) 2.5 95) ((player B 5) 4.1 18 -0 0.2) ((player B 7) 6 29 0 0.2) ((Player) 2.7 64) ((line r) 22.4 68))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test440() {
    String s = "(see 89 ((goal r) 23.8 -17) ((flag r b) 41.3 38) ((flag p r c) 7.4 -20 -0 0) ((Player) 3 -68) ((player B 5) 6 -33 -0 0.1) ((player B 6) 4.1 19 0.246 0.8) ((player B 7) 6.7 -13 -0 0.2) ((Player) 2 -133) ((player B 10) 2.7 31 -0 0.4) ((player B 11) 3.3 20 0 -3.7) ((line r) 24.8 74))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test441() {
    String s = "(see 90 ((goal r) 83.9 -21) ((flag c b) 45.6 25) ((flag r t) 90.9 -43) ((flag r b) 90 0) ((flag p r t) 70.8 -38) ((flag p r c) 67.4 -21) ((flag p r b) 70.1 -4) ((ball) 30 -22) ((Player) 2 -158) ((Player) 2 -93) ((Player) 2.5 -62) ((player A 7) 2 21 -0.24 3.6) ((player A 8) 3 7 -0.12 1.6) ((player A 9) 1.6 39 -0.16 6.6) ((Player) 2 179) ((Player) 2.5 -120) ((player) 60.3 -23) ((player) 66.7 -25) ((player) 60.3 -21) ((player) 60.3 -23) ((player) 66.7 -22) ((player) 66.7 -19) ((player) 66.7 -20) ((player) 60.3 -23) ((player) 60.3 -23) ((player) 60.3 -19) ((player) 60.3 -19) ((line r) 90 69))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test442() {
    String s = "(see 90 ((goal r) 85.6 15) ((flag c t) 45.2 -29) ((flag r t) 90.9 -6) ((flag r b) 93.7 36) ((flag p r t) 70.8 0) ((flag p r c) 69.4 15) ((flag p r b) 73 31) ((ball) 33.1 18) ((Player) 2.5 112) ((Player) 2.5 73) ((player) 66.7 14) ((player) 66.7 12) ((player) 60.3 16) ((player) 66.7 14) ((player) 66.7 15) ((player) 66.7 18) ((player) 66.7 17) ((player) 60.3 15) ((player) 66.7 14) ((player) 66.7 18) ((player) 66.7 18) ((line r) 88.2 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test443() {
    String s = "(see 90 ((goal r) 85.6 18) ((flag c t) 47.5 -27) ((flag r t) 91.8 -3) ((flag r b) 91.8 39) ((flag p r t) 71.5 1) ((flag p r c) 68.7 18) ((flag p r b) 71.5 34) ((ball) 33.1 18) ((player A 2) 2.2 0 -0 0.2) ((Player) 2 60) ((player A 4) 3.3 12 0.066 1.7) ((Player) 1.1 -105) ((Player) 0.7 141) ((player A 11) 1.6 -32 0.032 3) ((player) 66.7 16) ((player) 66.7 14) ((player) 60.3 18) ((player) 60.3 16) ((player) 66.7 17) ((player) 66.7 20) ((player) 66.7 19) ((player) 60.3 16) ((player) 66.7 16) ((player) 66.7 20) ((player) 66.7 20) ((line r) 90 -71))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test444() {
    String s = "(see 90 ((goal r) 83.1 6) ((flag c t) 45.6 -41) ((flag r t) 90 -16) ((flag r b) 90 28) ((flag p r t) 69.4 -10) ((flag p r c) 66.7 6) ((flag p r b) 70.1 23) ((ball) 30 7 0 -0) ((Player) 2.2 168) ((Player) 2 112) ((player A 4) 1.2 22 0.096 2.6) ((Player) 2.7 -167) ((Player) 2.7 158) ((Player) 1.2 -144) ((player) 60.3 4) ((player) 60.3 2) ((player) 60.3 7) ((player) 60.3 4) ((player) 66.7 5) ((player) 60.3 9) ((player) 66.7 7) ((player) 60.3 5) ((player) 60.3 4) ((player) 60.3 8) ((player) 60.3 8) ((line r) 83.9 -84))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test445() {
    String s = "(see 90 ((goal r) 82.3 -42) ((flag c b) 45.2 6) ((flag r b) 89.1 -19) ((flag p r c) 65.4 -42) ((flag p r b) 68.7 -25) ((ball) 30 -41 -0 -0.2) ((Player) 1.2 154) ((Player) 2.5 95) ((Player) 3 53) ((player A 8) 3 32 -0 -0.5) ((Player) 2.5 160) ((player) 60.3 -44) ((player) 60.3 -41) ((player) 60.3 -43) ((player) 66.7 -42) ((player) 60.3 -39) ((player) 66.7 -40) ((player) 60.3 -43) ((player) 60.3 -43) ((player) 60.3 -39) ((player) 60.3 -39) ((line b) 50.9 -42))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test446() {
    String s = "(see 90 ((flag c b) 48.4 -3) ((flag r b) 92.8 -27) ((Flag) 2.7 108) ((flag p r b) 73 -32) ((player A 1) 1.1 6 -0.022 -0.2) ((player A 2) 2.7 -42 -0 -0.1) ((player A 3) 3 -1 0.18 -2.5) ((player A 4) 4.1 -39 0.082 1) ((Player) 2.5 -130) ((player A 7) 5 -3 -0 0.1) ((player A 8) 6 -11 0.12 0) ((player A 9) 4.5 2 -0 0.1) ((player A 10) 1.6 33 0.032 -1.9) ((Player) 1.6 -58) ((line b) 46.1 -49))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test447() {
    String s = "(see 91 ((flag c b) 47 -17) ((flag r b) 91.8 -41) ((Flag) 2.8 129) ((flag p l b) 19.7 35 -0 0.1) ((Player) 1.2 -107) ((player A 3) 2.2 -43 0.088 -0.1) ((Player) 1.2 -148) ((player A 7) 4.1 -38 0.082 -2.6) ((player A 8) 5 -37 0 0.1) ((player A 9) 3.3 -24 -0.066 0.1) ((Player) 2.5 -114) ((line b) 37.7 -62))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test448() {
    String s = "(see 91 ((flag c b) 47.9 28) ((Flag) 1.9 -173) ((flag p r b) 18.5 -20 -0 -0.1) ((Player) 2.2 149) ((line b) 34.1 71))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test449() {
    String s = "(see 91 ((goal r) 83.9 -42) ((flag c b) 47.5 4) ((flag r b) 90.9 -20) ((flag p r c) 68 -42) ((flag p r b) 70.8 -26) ((ball) 33.1 -41 -0 -0) ((Player) 1.1 76) ((player A 2) 1.6 -23 0.192 -2.8) ((player A 3) 2.7 33 0.054 -1.2) ((player A 4) 2.5 -18 -0 0.6) ((Player) 1.5 110) ((Player) 2.7 -164) ((player A 7) 4.1 13 -0 -2.7) ((player A 8) 5 9 0 0.1) ((player A 9) 4.1 29 -0.082 0.6) ((Player) 2.5 84) ((player) 60.3 -44) ((player) 60.3 -41) ((player) 60.3 -43) ((player) 66.7 -43) ((player) 66.7 -39) ((player) 66.7 -41) ((player) 60.3 -43) ((player) 66.7 -44) ((player) 60.3 -40) ((player) 66.7 -40) ((line b) 50.9 -43))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test450() {
    String s = "(see 91 ((goal r) 23.1 -17) ((flag r b) 40.4 39) ((flag p r c) 6.6 -22 -0.132 -0.3) ((Player) 2.7 -72) ((player B 5) 5.5 -29 -0.11 0.7) ((player B 6) 3.7 25 -0.074 0.8) ((player B 7) 6 -6 -0.12 1) ((Player) 2.5 -143) ((player B 10) 2.2 40 -0.088 1.9) ((player B 11) 2.7 20 -0.108 0.1) ((line r) 23.8 74))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test451() {
    String s = "(see 91 ((flag r b) 37 -14) ((flag p r b) 17.5 6 -0 0.1) ((Player) 1.5 127) ((Player) 1.1 163) ((line b) 32.8 -70))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test452() {
    String s = "(see 91 ((goal r) 22 -36) ((flag r b) 38.1 25 0 -0) ((flag p r b) 18.4 43 0 -0) ((Player) 2.2 -152) ((player B 6) 1.5 -11 0.03 0.6) ((player B 7) 4.5 -41 -0 1.3) ((Player) 0.9 -54) ((line r) 25 60))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test453() {
    String s = "(see 91 ((goal r) 20.3 18) ((flag r t) 38.1 -44) ((flag p r c) 4.1 38 -0.164 2.2) ((Player) 0.9 -147) ((Player) 2 -76) ((Player) 1.3 -175) ((player B 5) 2.7 39 -0.108 5.5) ((line r) 20.7 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test454() {
    String s = "(see 91 ((goal r) 21.1 -30) ((flag r b) 41.7 24) ((flag p r c) 5 -12 0 0) ((flag p r b) 22.6 42) ((Player) 1.8 -97) ((Player) 0.7 94) ((player B 5) 3.7 -11 0.074 1.6) ((player B 7) 5.5 8 0.11 1) ((player B 9) 0.9 -16 0.18 -8.7) ((line r) 25.8 54))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test455() {
    String s = "(see 91 ((goal r) 21.5 -33) ((flag r b) 41.7 21) ((flag p r c) 5.3 -21 -0.212 -0.8) ((flag p r b) 22.2 39 -0 0.4) ((Player) 0.7 -87) ((Player) 2.5 -96) ((Player) 2.7 86) ((player B 5) 4.1 -23 -0.246 0.3) ((player B 6) 5 37 -0.2 1.7) ((player B 7) 5.5 0 -0.22 1.2) ((Player) 3 136) ((Player) 1.3 -46) ((player B 11) 3.7 43 -0.222 2.3) ((line r) 27.1 52))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test456() {
    String s = "(see 91 ((flag c b) 43.8 -6) ((flag r b) 89.1 -31) ((flag p r b) 68.7 -37) ((Player) 1.5 -166) ((Player) 1.1 -74) ((Player) 1.8 -54) ((line b) 39.6 -52))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test457() {
    String s = "(see 91 ((goal r) 21.1 6) ((flag p r c) 5 -13 -0 0.1) ((Player) 2.7 -130) ((player B 5) 4.1 -28 -0.082 1.2) ((Player) 1.1 67) ((player B 7) 3.7 4 -0.074 1.9) ((Player) 0.9 168) ((line r) 21.5 -76))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test458() {
    String s = "(see 91 ((goal r) 82.3 26) ((flag c t) 47 -22) ((flag r t) 90 4) ((flag p r t) 69.4 9) ((flag p r c) 65.4 26) ((flag p r b) 68 43) ((ball) 30 23) ((Player) 2 -121) ((Player) 2.5 -64) ((Player) 0.8 56) ((Player) 1.1 -174) ((player) 60.3 23) ((player) 60.3 22) ((player) 60.3 26) ((player) 60.3 24) ((player) 66.7 25) ((player) 60.3 28) ((player) 66.7 27) ((player) 60.3 24) ((player) 60.3 24) ((player) 60.3 28) ((player) 60.3 27) ((line t) 77.5 28))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test459() {
    String s = "(see 91 ((goal r) 20.5 -11) ((flag r b) 42.5 40) ((flag p r c) 5.2 23 -0.104 0.3) ((Player) 1.8 96) ((Player) 2.5 100) ((player B 5) 4.1 30 -0 1.6) ((player B 7) 6 40 -0 1.2) ((Player) 2 68) ((line r) 21.8 68))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test460() {
    String s = "(see 91 ((goal r) 24.5 -43) ((flag r b) 42.9 8) ((flag p r c) 8 -38 -0 -0) ((flag p r b) 22.6 23 -0 0.1) ((player B 3) 2.5 5 0.05 -1.1) ((Player) 3 -52) ((player B 5) 6.7 -41 -0 0.9) ((player B 6) 6 0 0 0.1) ((player B 7) 7.4 -24 -0 0.8) ((player B 10) 4.5 8 -0 0.3) ((player B 11) 5 -2 -0 -0.2) ((line r) 35.5 43))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test461() {
    String s = "(see 91 ((flag c b) 42.5 -20) ((flag p l b) 18.9 44 -0 0.1) ((Player) 2.7 141) ((Player) 0.8 140) ((Player) 1.8 110) ((line b) 33.8 -67))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  public void test462() {
    String s = "(see 91 ((flag r b) 38.9 -17) ((Flag) 1.4 -57) ((flag p r b) 20.7 6 -0 -0) ((player B 6) 4.5 44 -0.09 0.3) ((player B 7) 2.2 -2 -0 0.7) ((Player) 2.7 125) ((line b) 35.2 -80))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  private Set basicParseCmd(String s) throws ParseException {
    TestCommandFilter f = new TestCommandFilter();
    filterCommand(s, f);
    TestController c = new TestController();
    DummyPlayer player = new DummyPlayer();
    player.setTeamEast(true);
    player.setTeamName("teamEast");
    if (f.isTypeSee()) getCmdParser().parseSeeCommand(f.getCommand(), c, player);
    else if (f.isTypeError()) getCmdParser().parseErrorCommand(f.getCommand(), player);
    else if (f.isTypeHear()) getCmdParser().parseHearCommand(f.getCommand(), c, player);
    else if (f.isTypeInit()) getCmdParser().parseInitCommand(f.getCommand(), c, player);
    else if (f.isTypeSenseBody()) getCmdParser().parseSenseBodyCommand(f.getCommand(), c, player);
    else if (f.isTypeUndefined()) fail("CommandFilter could not identify type of: "+s);
    else fail("CommandFilter fails in: "+s);
    return c.getResult();
  }
  private void filterCommand(String cmd, CommandFilter f) throws ParseException {
      getFilter().run(cmd, f);
  }
  private Filter getFilter (){
    return new Filter();
  }
  private CmdParser getCmdParser () throws ParseException {
    if (cmdp == null) cmdp = new CmdParser(new StringReader(""));
    return cmdp;
  }
  static TestSuite suite () {
    try {
      return new TestSuite(Class.forName("atan.test.GeneratedTests"));
    } catch (ClassNotFoundException ex) {
      throw new Error(ex.getMessage());
    }
  }
}
