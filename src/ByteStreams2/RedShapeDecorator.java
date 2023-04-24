package ByteStreams2;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape){
        super(shape);
    }
    @Override
    public void draw(){
        shape.drew();
        System.out.println("Border Color : Red");

    }
}
