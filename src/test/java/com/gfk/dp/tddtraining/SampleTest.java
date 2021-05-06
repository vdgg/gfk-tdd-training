package com.gfk.dp.tddtraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void doSomethingReturnsSomething() {
        Sample sample = new Sample();
        String result = sample.doSomething();
        assertEquals("something", result);
    }
}