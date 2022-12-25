interface Vehicle{

    public void Apply_Break();
    public void Speed_Up();
    public void Gear_Change();

}
class Bicycle implements Vehicle{

    public void Apply_Break(){
        System.out.println("\nApplying break to the Bicycle");
    }
    public void Speed_Up(){
        System.out.println("\nSpeeding Up to the Bicycle");
    }
    public void Gear_Change(){
        System.out.println("\nGearing change to the Bicycle");
    }
}
class Car implements Vehicle{

    public void Apply_Break(){
        System.out.println("\nApplying break to the Car");
    }
    public void Speed_Up(){


        System.out.println("\nSpeeding Up to the Car");
    }
    public void Gear_Change(){
        System.out.println("\nGearing change to the Car");
    }
}
class Bike implements Vehicle{

    public void Apply_Break(){
        System.out.println("\nApplying break to the Bike");
    }
    public void Speed_Up(){
        System.out.println("\nSpeeding Up to the Bike");
    }
    public void Gear_Change(){
        System.out.println("\nGearing change to the Bike");
    }
}

class Vehicle_interface{
    public static void main(String args[]){

        System.out.print("\n----Bicycle class implementing Vehicle interface----");
        Bicycle b1 = new Bicycle();
        b1.Apply_Break();
        b1.Speed_Up();
        b1.Gear_Change();

        System.out.println("\n----Car class implementing Vehicle interface----");
        Car c1 = new Car();
        c1.Apply_Break();
        c1.Speed_Up();
        c1.Gear_Change();

        System.out.println("\n----Bike class implementing Vehicle interface----");
        Bike bk1 = new Bike();
        bk1.Apply_Break();
        bk1.Speed_Up();
        bk1.Gear_Change();
    }
}