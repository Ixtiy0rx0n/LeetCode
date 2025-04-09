package org.example;

public class Problem3280 {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
    }
    public static String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String binaryYear = String.format("%14s", Integer.toBinaryString(year)).replace(' ', '0');
        String binaryMonth = String.format("%04s", Integer.toBinaryString(month)).replace(' ', '0');
        String binaryDay = String.format("%05s", Integer.toBinaryString(day)).replace(' ', '0');

        return binaryDay + binaryMonth + binaryYear;
    }
}
