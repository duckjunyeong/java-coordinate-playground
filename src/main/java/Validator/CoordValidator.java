package Validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoordValidator {

  public static List<Integer> isValidStr(String coordStr) {
    List<String> splitedCoordStr = Arrays.asList(coordStr.split(","));
    List<Integer> coordVerifed = splitedCoordStr.stream()
        .map(CoordValidator::isValidNumRange)
        .collect(Collectors.toList());
    return coordVerifed;
  }

  public static int isValidNumRange(int num){
    if (num >= 0 && num <= 24) return num;
    throw new IllegalArgumentException("좌표값은 0이상 24이하의 숫자만 가능합니다.");
  }

  public static int isValidNumRange(String num){
    return isValidNumRange(Integer.parseInt(num));
  }
}
