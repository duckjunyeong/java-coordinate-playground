package utils;

public class MathUtils {
  public static double roundToPlaces(double num, int place) {
    double multiplier = 1.0;
    for (int i = 0; i < place; i++){
      multiplier *= 10.0;
    }
    return Math.round(num * multiplier) / multiplier;
  }
}
