import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoordinateTest {

  @Test
  @DisplayName("올바른 문자열이 주어졌을 때 Coordinate객체를 생성해내는가")
  void is_generate_Coordinate_Object(){
    String correctInput = "14,19";
    Point coordinate = new Point(correctInput);
    assertThat(coordinate).isEqualTo(new Point(14,19));
  }

  @Test
  @DisplayName("좌표값 범위를 벗어나는 값이 주어졌을 때 예외를 발생시키는가")
  void is_throw_exception(){
    String correctInput = "2,29";
    assertThrows(IllegalArgumentException.class, () -> {
      new Point(correctInput);
    });
  }

}
