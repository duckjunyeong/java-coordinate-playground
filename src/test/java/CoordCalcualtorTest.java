import Model.Points;
import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;


public class CoordCalcualtorTest {

  @Test
  @DisplayName("두 Coordinate값이 주어졌을 때 직선거리를 구하는지")
  void is_solve_distance(){
    Point coord1 = new Point(4, 9);
    Point coord2 = new Point(14, 19);

    assertThat(Points.getDistance(coord1, coord2)).isEqualTo(14.14, offset(0.01));
  }

  @Test
  @DisplayName("올바른 값이 입력되었을 때 객체를 생성하는지")
  void is_generate_object(){
    Point coord1 = new Point(4, 9);
    Point coord2 = new Point(14, 19);

    Points points = new Points(Arrays.asList("4,9", "14,19"));
    assertThat(points.getPointList()).isEqualTo(Arrays.asList(coord1, coord2));
  }
}
