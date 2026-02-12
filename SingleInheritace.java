class Vehicle{
    Vehicle(){
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("this vehicle is a car");
    }
}
public class SingleInheritace {
    public static  void main(String[] args){
        Car obj = new Car();
        
    }
}
