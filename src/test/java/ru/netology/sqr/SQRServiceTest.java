package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCount() {
          SQRService service = new SQRService();

          int actual = service.countSqr(200, 300);

          int expected = 3;

          Assertions.assertEquals(expected, actual);
       }

    @Test
    public void shouldCount1() {
        SQRService service = new SQRService();

        int actual = service.countSqr(200, 200);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCount2() {
        SQRService service = new SQRService();

        int actual = service.countSqr(400, 500);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCount3() {
        SQRService service = new SQRService();

        int actual = service.countSqr(-100, 100);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
