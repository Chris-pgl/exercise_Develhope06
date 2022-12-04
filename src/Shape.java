public class Shape {

    private String shapeName;

    private int numberOfAge;

    public Shape(){
        shapeName = "undefined Shape";
    }

    public Shape(double radius){
        System.out.println("Created object");
        System.out.println("--- Circle  ---");
        shapeName = "Shape_circle";
    }

    public Shape(int adges, double adgeleng){
        System.out.println("Created object");
        System.out.println("-- square --");
        numberOfAge = 20;
        shapeName = "Shape_square";

    }

    public Shape(int adges, double E1,double E2){
        System.out.println("Created object ");
        System.out.println("--- rectangle ---");
        numberOfAge = 29;
        shapeName = "Shape_rectangule";
    }

    public Shape(int adges,double E1, double E2, double E3){
        System.out.println("Created object");
        System.out.println("--- Triangle ---");
        numberOfAge = 30;
        shapeName = "Shape_triangle";
    }

    public String getShapeDetails(){
        return shapeName + " - " + numberOfAge;
    }

}
