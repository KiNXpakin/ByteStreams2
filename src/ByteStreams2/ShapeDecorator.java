package ByteStreams2;

public abstract class ShapeDecorator implements Shape{
    protected Shape shape;
    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    @Override
    public void drew() {
        shape.drew();

    }

    public abstract void draw();
}
