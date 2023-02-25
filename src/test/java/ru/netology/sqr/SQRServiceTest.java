package ru.netology.sqr;

import org.junit.jupiter.api.Test;

class SQRServiceTest {


    @Test
    void countSquares() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSquares(200, 300);
        equals(expected, actual);
    }

    private void equals(int expected, int actual) {
    }

    @Test
    void countSquaresOverLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(9802, 9900);
        equals(expected, actual);
    }


    @Test
    void countSquaresUnderLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(90, 99);
        equals(expected, actual);
    }


}