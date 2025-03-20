package View;

import Model.Point;
import utils.StrConvert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
  private static final String SEP = "-";

  public List<Point> translateToPointList(String userInput) {
    List<String> splitedInput = Arrays.asList(userInput.split(SEP));
    return splitedInput.stream()
        .map(StrConvert::toPointInstance)
        .collect(Collectors.toList());
  }
}
