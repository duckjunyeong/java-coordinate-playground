import Model.Points;
import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.CoordCalcualtor;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;


public class CoordCalcualtorTest {

  @Test
  @DisplayName("두 Coordinate값이 주어졌을 때 직선거리를 구하는지")
  void is_solve_distance(){
    Point coord1 = new Point(4, 9);
    Point coord2 = new Point(14, 19);

    List<Point> pointList = Arrays.asList(coord1, coord2);
    assertThat(CoordCalcualtor.getDistance(coord1, coord2)).isEqualTo(14.14, offset(0.01));
    assertThat(CoordCalcualtor.getDistance(pointList)).isEqualTo(14.14, offset(0.01));
  }
}
