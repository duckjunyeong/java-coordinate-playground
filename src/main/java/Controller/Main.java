package Controller;

import Model.Points;
import View.InputView;
import View.OutputView;

import java.util.List;

public class Main {
  private static final InputView inputView = new InputView();
  private static final OutputView outputView = new OutputView();

  public static void main(String[] args){
    while(true){
      try{
        List<String> coordList = inputView.readCoordinate();
        Points points = new Points(coordList);
        outputView.printGrid(points.getPointList());
        outputView.printDistance(points.getTwoPointDistance());
        break;
      }
      catch (Exception e){
        System.out.println("Please reWrite!!");
      }
    }
  }

}
