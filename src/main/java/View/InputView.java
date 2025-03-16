package View;

import utils.StrConvert;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
  private final Scanner scanner = new Scanner(System.in);

  public List<String> readCoordinate(){
    String userInput = scanner.nextLine();

    List<String> splitedUserInput = Arrays.asList(userInput.split("-"));

    return splitedUserInput.stream()
        .map(StrConvert::removeParen)
        .collect(Collectors.toList());
  }
}
