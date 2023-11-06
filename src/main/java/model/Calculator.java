package model;

public interface Calculator {
    // methods
    static float add(float num1, float num2) {
      return num1 + num2;
    }

    static float subtract(float num1, float num2) {
      return num1 - num2;
    }

    static float divide(float num1, float num2) throws IllegalArgumentException{
        if (num2 ==0) {
            throw new IllegalArgumentException("you cannot divide for 0");
        }
        return num1 / num2;
    }

    static float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
