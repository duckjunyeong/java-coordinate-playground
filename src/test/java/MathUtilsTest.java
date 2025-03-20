import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.MathUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MathUtilsTest {

  @Test
  @DisplayName("실수를 올바르게 반올림하는가")
  void MathUtils_roundToPlaces_Test(){
    double num = 14.142512;
    double num2 = 14.199512;
    double num3 = 14.199512;
    assertThat(MathUtils.roundToPlaces(num, 2)).isEqualTo(14.14);
    assertThat(MathUtils.roundToPlaces(num2, 2)).isEqualTo(14.20);
    assertThat(MathUtils.roundToPlaces(num3, 3)).isEqualTo(14.200);
  }
}
