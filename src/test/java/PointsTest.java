import Model.Point;
import Model.Points;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
  @DisplayName("pointList에 존재하는 좌표값들이 직사각형을 이루는지 판단하는가")
  void calcuRectangleExtent_test(){
    Points points = new Points(Arrays.asList("10,10", "22,10", "22,18", "10,18"));
    assertThat(points.calcuRectangleExtent()).isEqualTo(96);
  }

  @Test
  @DisplayName("pointList에 존재하는 좌표값들이 직사각형이 아니라면 예외를 발생시키는가")
  void calcuRectangleExtent_test_throwException(){
    Points points = new Points(Arrays.asList("10,9", "22,10", "22,18", "10,18"));
    assertThrows(IllegalArgumentException.class, () -> {
      points.calcuRectangleExtent();
    });
  }
}
