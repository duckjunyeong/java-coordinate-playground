import Model.Point;
import Model.Points;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointsTest {

  @Test
  @DisplayName("올바른 값이 입력되었을 때 객체를 생성하는지")
  void is_generate_object(){
    Point coord1 = new Point(4, 9);
    Point coord2 = new Point(14, 19);

    Points points = new Points(Arrays.asList("4,9", "14,19"));
    assertThat(points.getPointList()).isEqualTo(Arrays.asList(coord1, coord2));
  }

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
