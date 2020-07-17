package com.company.level13.lesson2.task9;

public class Solution {
  interface Movable{
      Double speed();
  }
  interface Runable extends Movable{
      Double speed(Runable run);
  }
}