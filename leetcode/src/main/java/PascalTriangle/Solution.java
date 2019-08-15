package PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    if (numRows == 0) {
      return result;
    }

    result.add(new ArrayList<>());
    result.get(0).add(1);

    for (int rowNum = 1; rowNum < numRows; rowNum++) {
      List<Integer> newRow = new ArrayList<>();
      List<Integer> prevRow = result.get(rowNum-1);

      newRow.add(1);

      for (int j = 1; j < rowNum; j++) {
        newRow.add(prevRow.get(j-1) + prevRow.get(j));
      }

      newRow.add(1);

      result.add(newRow);
    }

    return result;
  }

}
