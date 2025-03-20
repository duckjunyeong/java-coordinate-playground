package Controller;

import Model.*;
import View.InputView;
import View.OutputView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ShapeCalculation {

  private static final Map<Integer, Function<List<Point>, Shape>> shapeFrame = new HashMap<>();

  static{
    shapeFrame.put(2, Line::new);
    shapeFrame.put(3, Triangle::new);
    shapeFrame.put(4, Rectangle::new);
  }

  public void onCalculation(){
    List<Point> points = InputView.readPoints();
    OutputView.printGrid(points);
    Shape shape = generateShape(points);
    OutputView.printMessage(shape.getAreaInfo());
  }

  private Shape generateShape(List<Point> points) {
    return shapeFrame.get(points.size()).apply(points);
  }

}
