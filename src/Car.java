public class Car extends Vehicle{
    String name;
    static int numberOfCars;
    Car(String name){
        this.name=name;
        numberOfCars++;
    }
    static void numberOfCarsMethod(){
        System.out.println("You have "+numberOfCars+" cars");
    }
}
