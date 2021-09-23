package com.line;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    public void getLengthWhenSamePointShouldReturnZero() {
        Line line = new Line(1, 1, 1, 1);
        assertEquals(0, line.getLength(), 0.00001);
    }
}
