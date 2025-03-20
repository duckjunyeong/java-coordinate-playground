package utils;

import Model.Point;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrConvert {
  private static final String INCORRECT_FORMAT = "올바른 형식으로 입력해주세요.";

  public static Point toPointInstance(String strPoint) {
    Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)");
    Matcher matcher = pattern.matcher(strPoint);

    if (matcher.matches()){
      int x = Integer.parseInt(matcher.group(1));
      int y = Integer.parseInt(matcher.group(2));
      return new Point(x, y);
    }
    throw new IllegalArgumentException(INCORRECT_FORMAT);
  }
}
