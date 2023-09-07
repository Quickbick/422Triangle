package org.cpts422;

public class Triangle {
    private final int a;
    private final int b;

    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static boolean isWithinRange(int s) {
        return s >= 1 && s <= 200;
    }

    public boolean isValid() {
        return (this.a + this.b) > this.c && (this.a + this.c) > this.b && (this.b + this.c) > this.a;
    }

    public boolean isEquilateral() {
        return this.a == this.b && this.b == this.c;
    }

    public boolean isScalene() {
        return this.a != this.b && this.b != this.c && this.c != this.a;
    }
}
