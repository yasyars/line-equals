package com.line;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void getLengthWhenXsAreDifferentAndYsAreDifferentShouldReturnEuclideanDistance() {
        Line line = new Line(0, 0, 3, 4);
        assertEquals(5, line.getLength(), 0.00001);
    }

    @Test
    public void isEqualWhenComparedWithItselfShouldReturnTrue() {
        Line line = new Line(0, 0, 3, 4);
        assertTrue(line.isEqual(line));
    }

    @Test
    public void isEqualWhenX1IsNotTheSameShouldReturnFalse() {
        Line lineA = new Line(0, 0, 3, 4);
        Line lineB = new Line(1, 0, 3, 4);
        assertFalse(lineA.isEqual(lineB));
    }

    @Test
    public void isEqualWhenY1IsNotTheSameShouldReturnFalse() {
        Line lineA = new Line(0, 0, 3, 4);
        Line lineB = new Line(0, 1, 3, 4);
        assertFalse(lineA.isEqual(lineB));
    }

    @Test
    public void isEqualWhenX2IsNotTheSameShouldReturnFalse() {
        Line lineA = new Line(0, 0, 3, 4);
        Line lineB = new Line(0, 0, 1, 4);
        assertFalse(lineA.isEqual(lineB));
    }

    @Test
    public void isEqualWhenY2IsNotTheSameShouldReturnFalse() {
        Line lineA = new Line(0, 0, 0, 2);
        Line lineB = new Line(0, 0, 0, 4);
        assertFalse(lineA.isEqual(lineB));
    }
}
