import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.StrConvert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StrConvertTest {

  private final StrConvert strConvert = new StrConvert();

  @Test
  @DisplayName("좌표값의 문자열이 주어졌을 때 올바른 format인지 확인하고 Point객체를 반환한다.")
  void 올바른값일_때_toPointInstance_Method_Test(){
    String strPoint = "(10,22)";
    Point point = strConvert.toPointInstance(strPoint);
    assertThat(point).isEqualTo(new Point(10, 22));
  }

  @Test
  @DisplayName("좌표값의 문자열이 주어졌을 때 올바른 format이 아니라면 예외를 발생시킨다.")
  void 올바른값이_아닐_때_toPointInstance_Method_Test(){
    String strPoint = "(10,22(";
    assertThrows(IllegalArgumentException.class, () -> {
      strConvert.toPointInstance(strPoint);
    });

  }
}
