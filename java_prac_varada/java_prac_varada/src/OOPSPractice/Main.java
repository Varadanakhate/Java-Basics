package OOPSPractice;

public class Main {
    public static void main(String[] args) {
         TrafficLight light = new TrafficLight("red",30);
        System.out.println("light is red"+light.isRed());
        System.out.println("light is green"+light.isGreen());
        System.out.println("light duration"+light.getDuration());
        light.setDuration(20);
        System.out.println("light duration is now "+light.getDuration());
    }
}
