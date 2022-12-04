public class Tester {

    public static void main(String[] args) {

        Shape shape1 = new Shape();

        Shape shape2 = new Shape(20);

        Shape shape3 = new Shape(2,3);

        Shape shape4 = new Shape(4,7,9);

        Shape shape5 = new Shape(5,7,5,2);

        shape1.getShapeDetails();
        String shapedi1 = shape1.getShapeDetails();
        System.out.println(shapedi1);

        shape2.getShapeDetails();
        String shapedi2 = shape2.getShapeDetails();
        System.out.println(shapedi2);

        shape3.getShapeDetails();
        String shapedi3 = shape3.getShapeDetails();
        System.out.println(shapedi3);

        shape4.getShapeDetails();
        String shapedi4 = shape4.getShapeDetails();
        System.out.println(shapedi4);

        shape5.getShapeDetails();
        String shapedi5 = shape5.getShapeDetails();
        System.out.println(shapedi5);

    }
}
