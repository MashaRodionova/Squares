package ru.netology.sqr;
public class SQRService {
    public long calculate(int lowLimit, int upLimit) {
        long count = 0;
        for (int i = 10; i <= 99; i++) {
            long x = i * i;
            if (x >= lowLimit && x <= upLimit) {
                count++;
            }
        }
        return count;
    }
}
