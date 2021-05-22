package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight1 = new TrafficLight();
        //trafficLight.color = "red";
        //Above can be used, but is not necessarily the best practice. Should use method to update.
        trafficLight1.changeColor("red");
        //call method to access the variable
        trafficLight1.displayColor();

        trafficLight1.changeColor("green");
        trafficLight1.displayColor();

        TrafficLight trafficLight2 = new TrafficLight();

    }
}
