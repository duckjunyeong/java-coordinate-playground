package Model;

import utils.CoordCalcualtor;
import java.util.Collections;
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

  public int calcuRectangleExtent() {
    Collections.sort(pointList);
    Point pos1 = pointList.get(0);
    Point pos2 = pointList.get(1);
    Point pos3 = pointList.get(2);
    Point pos4 = pointList.get(3);

    if (isSamePosOfX(pos1, pos2) && isSamePosOfX(pos3, pos4)) {
      if (getColSize(pos1, pos2) == getColSize(pos2, pos3)) {
        return getColSize(pos1, pos2) * getRowSize(pos1, pos3);
      }
    }
    throw new IllegalArgumentException("직사각형이 아닙니다.");
  }

  public int getRowSize(Point pos1, Point pos2){
    return Math.abs(pos1.getX() - pos2.getX());
  }

  public int getColSize(Point pos1, Point pos2){
    return Math.abs(pos1.getY() - pos2.getY());
  }

  public boolean isSamePosOfX(Point pos1, Point pos2){
    return pos1.getX() == pos2.getX();
  }
}
