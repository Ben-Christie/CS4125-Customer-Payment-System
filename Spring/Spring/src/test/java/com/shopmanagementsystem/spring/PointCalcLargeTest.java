package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;


class PointCalcLargeTest {

    @Test
    void processTest() {
        var testingProcess = new process();
        assertEquals(-1 || 0, testingProcess("apples"));
    }

}