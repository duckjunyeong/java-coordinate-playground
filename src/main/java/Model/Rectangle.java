package Model;

import utils.MathUtils;
import utils.PointCalcualtor;

import java.util.Collections;
import java.util.List;

public class Rectangle extends Shape{
  public Rectangle(List<Point> pointList) {
    super(pointList);
  }

  @Override
  public double getArea(){
    Collections.sort(points);
    Point pos1 = points.get(0);
    Point pos2 = points.get(1);
    Point pos3 = points.get(2);

    double rowDistance = PointCalcualtor.getDistance(pos1, pos3);
    double colDistance = PointCalcualtor.getDistance(pos1, pos2);
    return MathUtils.roundToPlaces(rowDistance * colDistance, 0);
  }
}
