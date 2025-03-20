package Model;

import utils.MathUtils;
import utils.PointCalcualtor;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rectangle extends Shape{
  private static final String AREAINFO_MESSAGE = "Rectangle extent: ";
  public static final String INCORRECT_RECTANGLE_POINTS = "직사각형이 아닙니다.";

  public Rectangle(List<Point> pointList) {
    super(pointList);
    isValidRectangle();
  }

  private void isValidRectangle() {
    Set<Integer> uniquePointOfX = getUniquePointOfX();
    Set<Integer> uniquePointOfY = getUniquePointOfY();

    if(uniquePointOfX.size() != 2 || uniquePointOfY.size() != 2){
      throw new IllegalArgumentException(INCORRECT_RECTANGLE_POINTS);
    }
  }

  private Set<Integer> getUniquePointOfX() {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < 4; i++){
      set.add(points.get(i).getX());
    }
    return set;
  }

  private Set<Integer> getUniquePointOfY() {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < 4; i++){
      set.add(points.get(i).getY());
    }
    return set;
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

  @Override
  public String getAreaInfo(){
    return AREAINFO_MESSAGE + getArea();
  }
}
