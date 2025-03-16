package Model;

import utils.CoordCalcualtor;

import java.util.List;
import java.util.stream.Collectors;

public class Points {
  List<Point> pointList;

  public Points(List<String> pointList){
    this.pointList = pointList.stream()
        .map(Point::new)
        .collect(Collectors.toList());
  }

  public double getTwoPointDistance(){
    return CoordCalcualtor.getDistance(pointList);
  }

  public List<Point> getPointList(){
    return pointList;
  }
}
