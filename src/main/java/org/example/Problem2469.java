package org.example;

public class Problem2469 {
    public static void main(String[] args) {
        System.out.println(convertTemperature(36.50));
    }

    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}


//Kelvin = Celsius + 273.15
//Fahrenheit = Celsius * 1.80 + 32.00