package Abstractions;

public abstract class Shape implements IShape {
    private long width;
    private long height;

    public Shape(long width, long height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public long getArea() {
        return width * height;
    }
}
