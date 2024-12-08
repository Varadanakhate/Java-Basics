package Static.Static;

public  class Constants {
    public static final double PI=3.14159;
    public static double calculateArea(double radius){
        return PI*radius*radius;
    }

    public static void main(String[] args) {
        double radius=5;
        double area=calculateArea(radius);
        System.out.println("radius"+radius);
        System.out.println("area"+area);
    }
}
