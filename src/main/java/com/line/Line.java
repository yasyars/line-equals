package com.line;

public class Line {
    private int x1, x2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getLength() {
        return Math.abs(this.x2 - this.x1);
    }
}
