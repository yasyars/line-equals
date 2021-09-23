package com.line;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    public void getLengthWhenSamePointShouldReturnZero() {
        Line line = new Line(1, 1, 1, 1);
        assertEquals(0, line.getLength(), 0.00001);
    }

    @Test
    public void getLengthWhenYsAreSameAndX1LessThanX2ShouldReturnDifferentBetweenX1X2() {
        Line line = new Line(1, 1, 9, 1);
        assertEquals(8, line.getLength(), 0.00001);
    }

    @Test
    public void getLengthWhenYsAreSameAndX1GreaterThanX2ShouldReturnAbsoluteDifferentBetweenX1X2() {
        Line line = new Line(9, 1, 1, 1);
        assertEquals(8, line.getLength(), 0.00001);
    }

    @Test
    public void getLengthWhenXsAreSameAndY1LessThanY2ShouldReturnDifferentBetweenY1Y2() {
        Line line = new Line(1, 1, 1, 9);
        assertEquals(8, line.getLength(), 0.00001);
    }

    @Test
    public void getLengthWhenXsAreSameAndY1GreaterThanY2ShouldReturnAbsoluteDifferentBetweenY1Y2() {
        Line line = new Line(1, 9, 1, 1);
        assertEquals(8, line.getLength(), 0.00001);
    }
}
