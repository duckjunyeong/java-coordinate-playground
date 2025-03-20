package Model;

import utils.PointCalcualtor;

import java.util.List;

public class Triangle extends Shape {


  public Triangle(List<Point> pointList) {
    super(pointList);
  }

  public double getArea() {
    Point pos1 = points.get(0);
    Point pos2 = points.get(1);
    Point pos3 = points.get(2);

    double a = PointCalcualtor.getDistance(pos1, pos2);
    double b = PointCalcualtor.getDistance(pos1, pos3);
    double c = PointCalcualtor.getDistance(pos2, pos3);

    double s = (a + b + c) / 2;
    double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    return Math.round(result * 100) / 100.0;
  }
}
