package Example25;

abstract class MotorVehicle {
    protected String registration;

    protected int wheelSize;

    public void accelerate() {
        // something would be here
    }

    public void decelerate() {
        // something would be here
    }

    public abstract void load();

    public abstract void unload();
}

class Truck extends MotorVehicle {

    protected int numAxels;

    public void load() {
        // something would be here
    }

    public void unload() {
        // something would be here
    }

}

class FuelTruck extends Truck {
    protected int tankVolume;

    public void load() {}

    public void unload() {}
}

class CoolerTruck extends Truck {
    protected int currTemp;

    public void cool() {}
}

class Car extends MotorVehicle {
    protected int numDoors;

    public void load() {}

    public void unload() {}
}

class Jeep extends Car {
    protected int fordingDepth;

    public void lockDiffGear() {}

    public void unlockDiffGear() {}
}

class Convertible extends Car {
    protected String topType;

    public void openTop() {}

    public void closeTop() {}
}

public class Inheritance {
    public static void main(String[] args) {
        /*
         * Truck = reference type
         * FuelTruck= object type
         * Þeas, t.load() kallar i functionið ur Truck,
         * og ekki hægt að kalla i nein function ur FuelTruck sem eru ekki i Truck.
         */
//        This is questionable, is this supposted to be a public prop?
        Truck t = new FuelTruck();
        t.numAxels = 3;

        Jeep j = new Jeep();
        j.lockDiffGear();

        MotorVehicle mv = new Truck();
        mv.unload();

        Convertible conv = new Convertible();
        conv.load();

//        This won't compile
        CoolerTruck ct = new Truck();
        ct.currTemp = -18;

//        Won't compile, can't instantiate an abstract class
        MotorVehicle mv = new MotorVehicle();
        mv.accelerate();

//        Won't compile, since with the reference type Car, you won't be able to access Convertible-only functions
        Car car = new Convertible();
        car.openTop();

    }
}
