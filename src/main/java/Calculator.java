public class Calculator {
 private double calc = 0.0;

 public double add(int num1, int num2) {
  calc = num1 + num2;
  return calc;
 }

 public double subtract(int num1, int num2) {
  calc = num1 - num2;
  return calc;
 }

 public double reset() {
  calc = 0.0;
  return calc;
 }
}
