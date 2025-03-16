package View;

import Model.Point;

import java.util.List;

public class OutputView {
  private final Grid grid = new Grid();

  public void printGrid(List<Point> points){
    grid.printGrid(points);
  }

  public void printDistance(double distance) {
      System.out.println("Distance: " + distance);
  }

  public void writePoints() {
      System.out.println("Write Points");
  }
}
