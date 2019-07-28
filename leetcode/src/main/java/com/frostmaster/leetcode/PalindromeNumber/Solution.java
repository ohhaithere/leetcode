package com.frostmaster.leetcode.PalindromeNumber;

public class Solution {

  public static void main(String[] args) {
    System.out.println(fib(6));
  }


  /* Вывести N-ый элемент последовательности Фибоначчи (каждый N-ый элемент последовательности равен сумме N-1 и N-2 элементов: 1, 1, 2, 3, 5, 8)
  Функция должна принимать индекс и выводить соответствующее число.
  */

  public static int fib(int x) {
    if (x < 1) {
      throw new IllegalArgumentException();
    }

    if (x < 3) {
      return 1;
    }

    int prev = 1;
    int current = 1;
    int next = 1;
    for (int i = 2; i < x; i++) {
      next = prev + current;
      prev = current;
      current = next;
    }

    return current;
  }

}
