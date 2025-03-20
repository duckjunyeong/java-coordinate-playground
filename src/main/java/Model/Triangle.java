package Model;

import utils.MathUtils;
import utils.PointCalcualtor;

import java.util.List;


public class Triangle extends Shape {
  private static final String AREAINFO_MESSAGE = "Triangle extent: ";

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

    return MathUtils.roundToPlaces(result, 2);
  }

  @Override
  public String getAreaInfo(){
    return AREAINFO_MESSAGE + getArea();
  }
}
