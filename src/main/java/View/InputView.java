package View;

import utils.StrConvert;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
  private final Scanner scanner = new Scanner(System.in);
  private final OutputView outputView = new OutputView();

  public List<String> readCoordinate(){
    outputView.writePoints();
    String userInput = scanner.nextLine();

    List<String> splitedUserInput = Arrays.asList(userInput.split("-"));

    return splitedUserInput.stream()
        .map(StrConvert::removeParen)
        .collect(Collectors.toList());
  }
}
