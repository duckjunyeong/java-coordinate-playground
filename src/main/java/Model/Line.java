package Model;

import utils.PointCalcualtor;

import java.util.List;

public class Line extends Shape{
  private final String name = "Line";

  // 생성자에서 pointList의 사이즈가 2개라면 만들 수 있게 할려고 했는데 어려움
  public Line(List<Point> pointList) {
    super(pointList);
  }

  @Override
  public double getArea(){
    Point pos1 = points.get(0);
    Point pos2 = points.get(1);
    return PointCalcualtor.getDistance(pos1, pos2);
  }

}
