package Controller;

import Model.Points;
import View.InputView;
import View.OutputView;

import java.util.List;

public class Main {
  private static final InputView inputView = new InputView();
  private static final OutputView outputView = new OutputView();

  public static void main(String[] args){
    List<String> coordList = inputView.readCoordinate();
    Points points = new Points(coordList);
    System.out.print(points.getTwoPointDistance());
  }

}
