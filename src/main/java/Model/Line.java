package Model;

import utils.PointCalcualtor;

import java.util.List;

public class Line extends Shape{
  private final String name = "Line";
  private final String AREAINFO_MESSAGE = "Distance: ";

  public Line(List<Point> pointList) {
    super(pointList);
  }

  @Override
  public double getArea(){
    Point pos1 = points.get(0);
    Point pos2 = points.get(1);
    return PointCalcualtor.getDistance(pos1, pos2);
  }

  @Override
  public String getAreaInfo(){
    return AREAINFO_MESSAGE + getArea();
  }

}
