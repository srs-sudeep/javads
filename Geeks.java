class Car {
    String model;
    int year;
    Car (String model, int year){
        this.model = model;
        this.year = year;
    }
    void drive(){
        System.out.println("Car is driving");
    }
    void display(){
        System.out.println("Model : " + this.model + " Year : " + this.year);
    }

}

public class Geeks {
    public static void main(String[] args){
        Car c = new Car("BMW",2025);
        c.display();
        c.drive();
    }
}