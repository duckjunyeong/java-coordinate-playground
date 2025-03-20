package Model;

import java.util.List;

public class Line extends Shape{
  private final String name = "Line";

  // 생성자에서 pointList의 사이즈가 2개라면 만들 수 있게 할려고 했는데 어려움
  public Line(List<Point> pointList) {
    super(pointList);
  }

  private void isTwoPoints(List<Point> pointList) {
    if (pointList.size() != 2){
      throw new IllegalArgumentException("선을 만들기 위해서는 2개의 좌표가 입력되어야 합니다.");
    }
  }

  @Override
  public double getArea(){
    return 1.1;
  }

}
