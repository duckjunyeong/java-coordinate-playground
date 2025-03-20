import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Model.Point;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PointTest {

  @Test
  @DisplayName("0과 24이하의 숫자가 주어졌을 때 Point객체가 생성되는가")
  void 올바른값이주어졌을_때_Point객체생성(){
    Point point = new Point(24,0);
    assertThat(point.getX()).isEqualTo(24);
    assertThat(point.getY()).isEqualTo(0);
  }

  @Test
  @DisplayName("0미만 24보다 큰 숫자가 주어졌을 때 Point객체시 예외가 발생하는가")
  void 올바르지않은_값일_때_Point객체생성시_예외발생(){
    assertThrows(IllegalArgumentException.class, () -> {
      new Point(25,0);
    });

    assertThrows(IllegalArgumentException.class, () -> {
      new Point(24,-1);
    });
  }
}
