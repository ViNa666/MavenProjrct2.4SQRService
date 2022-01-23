package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void shouldSqrInRangeWithResultInRange() {

        SQRService service = new SQRService();
        int lowerLimit = 1;
        int upperLimit = 1000;
        int expected = 22;

        int actual = service.SqrInRange(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSqrInRangeWithoutResultInRange() {

        SQRService service = new SQRService();
        int lowerLimit = 50;
        int upperLimit = 90;
        int expected = 0;

        int actual = service.SqrInRange(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }
}