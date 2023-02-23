package ru.netology.sqr;

public class SQRService {

    public int countSquares(int minimum, int maximum) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minimum && i * i <= maximum) {
                count++;
            }
        }

        return count;
    }

}