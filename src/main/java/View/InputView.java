package View;

import Model.Point;
import utils.StrConvert;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
  private static final String SEP = "-";
  private static final String MESSAGE_WRITE_POINT = "Write Points";
  private static final Scanner scanner = new Scanner(System.in);

  public static List<Point> readPoints(){
    System.out.println(MESSAGE_WRITE_POINT);
    String userInput = scanner.nextLine();
    return translateToPointList(userInput);
  }

  private static List<Point> translateToPointList(String userInput) {
    List<String> splitedInput = Arrays.asList(userInput.split(SEP));
    return splitedInput.stream()
        .map(StrConvert::toPointInstance)
        .collect(Collectors.toList());
  }
}
