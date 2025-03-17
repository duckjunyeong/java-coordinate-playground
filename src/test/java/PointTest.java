import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PointTest {

  @Test
  @DisplayName("point자료형이 x를 기준으로 정렬되는가")
  void sort_by_point_x(){
    List<Point> list = Arrays.asList(new Point(9,1), new Point(8,2), new Point(7,1));
    Collections.sort(list);
    for (Point point: list){
      System.out.println(point.getX() + ", " + point.getY());
    }
  }
}
