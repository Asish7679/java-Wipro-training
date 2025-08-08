package class23_7;

public class car1 {
	    public static void main(String[] args) {
	        car myCar = new car();
	        myCar.setEngineStatus(true);
	        myCar.setSpeed(60);
	        myCar.setFuelLevel(50.5);

	        System.out.println("Engine is " + (myCar.isEngineOn() ? "ON" : "OFF"));
	        System.out.println("Current Speed: " + myCar.getSpeed() + " km/h");
	        System.out.println("Fuel Level: " + myCar.getFuelLevel() + "%");

	    }
	}

