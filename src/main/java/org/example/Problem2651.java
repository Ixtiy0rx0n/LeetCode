package org.example;

public class Problem2651 {
    public static void main(String[] args) {
        System.out.println(findDelayedArrivalTime(15, 5));
    }
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return arrivalTime+delayedTime > 23 ? (arrivalTime+delayedTime) % 24 : arrivalTime+delayedTime;
    }
}
