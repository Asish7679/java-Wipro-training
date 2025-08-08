package class23_7;

public class car {
	    private boolean engineStatus; 
	    private double fuelLevel;
	    private int speed;
	    public boolean isEngineOn() {
	        return engineStatus;
	    }

	    public void setEngineStatus(boolean engineStatus) {
	        this.engineStatus = engineStatus;
	    }
	    public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        if (speed >= 0) {
	            this.speed = speed;
	        } else {
	            System.out.println("Speed cannot be negative.");
	        }
	    }
	    public double getFuelLevel() {
	        return fuelLevel;
	    }

	    public void setFuelLevel(double fuelLevel) {
	        if (fuelLevel >= 0 && fuelLevel <= 100) {
	            this.fuelLevel = fuelLevel;
	        } else {
	            System.out.println("Fuel level must be between 0 and 100.");
	        }
	    }
	}
