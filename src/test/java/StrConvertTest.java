import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.StrConvert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StrConvertTest {

  @Test
  @DisplayName("괄호에 의해 감싸진 올바른 좌표값을 변환시킬 때 올바르게 동작되는가")
  void removeParen_test(){
    String correctInput = "(10,11)";
    assertThat(StrConvert.removeParen(correctInput)).isEqualTo("10,11");
  }
  @Test
  @DisplayName("괄호에 의해 안 감싸진 좌표값이 들어갔을 때 예외를 발생시키는가")
  void is_Thorw_Exception(){
    String correctInput = ")10,11)";
    assertThrows(IllegalArgumentException.class, () -> {
      StrConvert.removeParen(correctInput);
    });
  }

}
