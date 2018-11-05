public class Test {
    public static void main(String[] args) {
        double percent = (Math.random()*100);
        System.out.println("Each shape increase " + percent);

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(2);
        resizeables[1] = new Rectangle(4,7);
        resizeables[2] = new Square(9);
        for (Resizeable resizeable : resizeables){
            resizeable.increaseSize(percent);
        }

        Shape[] shapes = new Shape[3];
        shapes[0] = (Circle) resizeables[0];
        shapes[1] = (Rectangle) resizeables[1];
        shapes[2] = (Square) resizeables[2];
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
